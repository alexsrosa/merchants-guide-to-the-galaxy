package thoughtworks.problem.merchantsguidetothegalaxy.business.rules;

import thoughtworks.problem.merchantsguidetothegalaxy.exception.GeneralExceptionUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.model.RomanModel;

import java.util.Objects;

/**
 * Class containing the rule of maximum numbers of Roman numerals.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class RomanMaximumRule implements ChainRule {

    private ChainRule next;

    @Override
    public void setNext(ChainRule rule) {
        this.next = rule;
    }

    @Override
    public void executeChain(RomanModel romanModel) {
        if (Objects.nonNull(this.next)) {
            this.next.invoke(romanModel);
        }
    }

    /**
     * Method invoking the rule.
     *
     * @return type {@link RomanMaximumRule}
     */
    public void invoke(RomanModel romanModel) {
        if (romanModel.getRomansMax().containsKey(romanModel.getParameter().getRomanNumeralsEnum().getName())) {
            Integer contador = romanModel.getRomansMax().get(romanModel.getParameter().getRomanNumeralsEnum().getName());
            contador++;

            if (contador > romanModel.getParameter().getRomanNumeralsEnum().getMaximum()) {
                GeneralExceptionUtils.error();
            }

            romanModel.getRomansMax().remove(romanModel.getParameter().getRomanNumeralsEnum().getName());
            romanModel.getRomansMax().put(romanModel.getParameter().getRomanNumeralsEnum().getName(), contador);
        } else {
            romanModel.getRomansMax().put(romanModel.getParameter().getRomanNumeralsEnum().getName(), 1);
        }
        this.executeChain(romanModel);
    }
}
