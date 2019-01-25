package thoughtworks.problem.merchantsguidetothegalaxy.business.rules;

import thoughtworks.problem.merchantsguidetothegalaxy.exception.GeneralExceptionUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.model.RomanModel;

import java.util.Objects;

/**
 * Class containing the rule of subtraction of Roman numbers.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class SubtractedRomanRule {

    /**
     * Method invoking the rule.
     *
     * @return type {@link Integer}
     */
    public static Integer  invoke(RomanModel romanModel) {
        if (Objects.nonNull(romanModel.getBeforeRoman())
                && romanModel.getParameter().getRomanNumeralsEnum().getSubtractedBy().equals(romanModel.getBeforeRoman().getName())) {
            romanModel.setResult((romanModel.getResult() - romanModel.getLastValue()) + (romanModel.getCurrentValue() - romanModel.getLastValue()));
        } else {
            GeneralExceptionUtils.error();
        }
        return romanModel.getResult();
    }
}
