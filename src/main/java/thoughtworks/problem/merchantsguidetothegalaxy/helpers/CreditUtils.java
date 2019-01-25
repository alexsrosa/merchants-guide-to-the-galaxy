package thoughtworks.problem.merchantsguidetothegalaxy.helpers;

import thoughtworks.problem.merchantsguidetothegalaxy.exception.GeneralExceptionUtils;

import java.util.List;

/**
 * Utilitarian class for processing some credit rules.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class CreditUtils {

    private static final String PATTERN_CREDIT_VALUE = "[0-9]+";
    private static final String PATTERN_CREDIT_DETAIL = "[^A-Z]+ ";
    private static final String PATTERN_MATERIAL = "[A-Z]+[a-z]+";

    /**
     * Method that is valid if past attributes match a credit.
     *
     * @param values      values in array format
     * @param inputPhrase attribute containing phrase received
     * @return returns true if it is a credit and false if it is not
     */
    public static boolean isCredits(String[] values, String inputPhrase) {
        if (values.length > 3) {
            getMaterial(inputPhrase);
            getCreditDetail(inputPhrase);
            getCreditValue(inputPhrase);
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

    /**
     * A method that extracts a material from an input phrase.
     *
     * @param inputPhrase attribute containing phrase received
     * @return string of material
     */
    public static String getMaterial(String inputPhrase) {
        List<String> strings = StringUtils.searchEngine(PATTERN_MATERIAL, inputPhrase);

        if (strings.size() != 2) {
            GeneralExceptionUtils.error();
        }

        return strings.get(0);
    }

    /**
     * Method that extracts the detail of a credit, which means the Roman numbers.
     *
     * @param inputPhrase attribute containing phrase received
     * @return string of credit detail
     */
    public static String getCreditDetail(String inputPhrase) {
        return StringUtils.searchEngine(PATTERN_CREDIT_DETAIL, inputPhrase).get(0);
    }

    /**
     * Method that extracts the detail of a value.
     *
     * @param inputPhrase attribute containing phrase received
     * @return string of credit value
     */
    public static String getCreditValue(String inputPhrase) {
        return StringUtils.searchEngine(PATTERN_CREDIT_VALUE, inputPhrase).get(0);
    }

    /**
     * Method that calculates credits.
     *
     * @param unitaryValue Unit value used for fine calculation
     * @param calculate    Value to be multiplied to arrive at the result value
     * @return returns the result of the operation
     */
    public static int calculateCredits(double unitaryValue, int calculate) {
        Double valueCalculated = unitaryValue * calculate;
        return valueCalculated.intValue();
    }
}
