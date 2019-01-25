package thoughtworks.problem.merchantsguidetothegalaxy.business.rules;

import thoughtworks.problem.merchantsguidetothegalaxy.model.RomanModel;

import java.util.Objects;

/**
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class CalculateRomanRule implements ChainRule {

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
     * @return type {@link CalculateRomanRule}
     */
    public void invoke(RomanModel romanModel) {
        if (romanModel.getLastValue() == 0 || romanModel.getLastValue() >= romanModel.getCurrentValue()) {
            romanModel.setResult(romanModel.getResult() + romanModel.getCurrentValue());
        } else if (romanModel.getLastValue() < romanModel.getCurrentValue()) {
            romanModel.setResult(SubtractedRomanRule.invoke(romanModel));
        }

        romanModel.setLastValue(romanModel.getCurrentValue());
        this.executeChain(romanModel);
    }
}
