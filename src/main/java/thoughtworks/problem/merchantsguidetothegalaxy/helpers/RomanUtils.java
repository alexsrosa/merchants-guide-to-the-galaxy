package thoughtworks.problem.merchantsguidetothegalaxy.helpers;

import thoughtworks.problem.merchantsguidetothegalaxy.business.repositories.ParameterRepository;
import thoughtworks.problem.merchantsguidetothegalaxy.business.rules.CalculateRomanRule;
import thoughtworks.problem.merchantsguidetothegalaxy.business.rules.RomanConsecutivesRule;
import thoughtworks.problem.merchantsguidetothegalaxy.business.rules.RomanMaximumRule;
import thoughtworks.problem.merchantsguidetothegalaxy.exception.GeneralExceptionUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.model.ParameterModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.RomanModel;

import java.util.Objects;

/**
 * Utilitarian class of Roman numerals.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class RomanUtils {

    /**
     * Método que efetua o cálculo dos números romanos.
     *
     * @param romans string containing Roman numerals
     * @return returns calculation result
     */
    public static Integer calculate(String romans) {

        RomanModel romanModel = new RomanModel();

        for (String param : romans.split(StringUtils.ONE_SPACE)) {

            romanModel.setParameter(findParameter(param));
            romanModel.setCurrentValue(romanModel.getParameter().getRomanNumeralsEnum().getValue());

            CalculateRomanRule calculateResult = new CalculateRomanRule();
            RomanConsecutivesRule ruleConsecutives = new RomanConsecutivesRule();
            RomanMaximumRule romanMaximumRule = new RomanMaximumRule();

            calculateResult.setNext(ruleConsecutives);
            ruleConsecutives.setNext(romanMaximumRule);
            calculateResult.invoke(romanModel);
        }

        return romanModel.getResult();
    }

    /**
     * Method that performs the search of the parameter.
     *
     * @param param attribute containing a romante number for search
     * @return returns object {@link ParameterModel}
     */
    private static ParameterModel findParameter(String param) {

        ParameterModel parameter = new ParameterRepository().findOne(param);

        if (Objects.isNull(parameter)) {
            GeneralExceptionUtils.error();
        }
        return parameter;
    }
}
