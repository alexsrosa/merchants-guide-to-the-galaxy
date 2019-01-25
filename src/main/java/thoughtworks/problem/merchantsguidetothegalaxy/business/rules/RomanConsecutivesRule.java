package thoughtworks.problem.merchantsguidetothegalaxy.business.rules;

import thoughtworks.problem.merchantsguidetothegalaxy.exception.GeneralExceptionUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.model.RomanModel;

import java.util.Objects;

/**
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class RomanConsecutivesRule implements ChainRule{

    private ChainRule next;

    @Override
    public void setNext(ChainRule rule) {
        this.next = rule;
    }

    @Override
    public void executeChain(RomanModel romanModel) {
        if(Objects.nonNull(this.next)){
            this.next.invoke(romanModel);
        }
    }

    /**
     * Method invoking the rule.
     *
     * @return type {@link CalculateRomanRule}
     */
    public void invoke(RomanModel romanModel) {
        if (Objects.nonNull(romanModel.getBeforeRoman()) && romanModel.getParameter().getRomanNumeralsEnum().equals(romanModel.getBeforeRoman())) {
            romanModel.setConsecutiveRoman(romanModel.getConsecutiveRoman() + 1);

            if (romanModel.getConsecutiveRoman() > romanModel.getParameter().getRomanNumeralsEnum().getConsecutiveRepetitions()) {
                GeneralExceptionUtils.error();
            }
        } else {
            romanModel.setConsecutiveRoman(1);
        }
        romanModel.setBeforeRoman(romanModel.getParameter().getRomanNumeralsEnum());

        executeChain(romanModel);
    }
}
