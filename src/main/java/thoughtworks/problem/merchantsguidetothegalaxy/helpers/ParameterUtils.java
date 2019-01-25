package thoughtworks.problem.merchantsguidetothegalaxy.helpers;

import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;

/**
 * Utility class for handling parameters.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class ParameterUtils {

    private static final String IS = "is";

    /**
     * Method that checks a phrase is to match a parameter.
     *
     * @param values values in array format
     * @return returns true if it is a parameter and false if it is not
     */
    public static boolean isParameter(String... values) {

        if (values.length == 3 && IS.equals(values[1].trim())) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

    /**
     * A method that extracts a parameter from an {@link InputModel}.
     *
     * @param input objeto type {@link InputModel}
     * @return string of parameter
     */
    public static String getParameterName(InputModel input) {
        String[] values = input.getValues();

        if (values.length != 3) {
            return null;
        }

        return values[0];
    }

    /**
     * A method that extracts a value from an {@link InputModel}.
     *
     * @param input objeto type {@link InputModel}
     * @return string of value
     */
    public static String getValue(InputModel input) {
        String[] values = input.getValues();

        if (values.length != 3) {
            return null;
        }

        return values[2].toUpperCase();
    }
}
