package thoughtworks.problem.merchantsguidetothegalaxy.helpers;

import thoughtworks.problem.merchantsguidetothegalaxy.exception.GeneralExceptionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class to handle strings.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class StringUtils {

    public final static String ONE_SPACE = " ";
    public final static String EMPTY = "";

    /**
     * Method that validates if string is valid.
     *
     * @param value string to validate
     */
    public static void validateString(String value) {

        if (Objects.isNull(value) || value.split(StringUtils.ONE_SPACE).length == 0) {
            GeneralExceptionUtils.error();
        }
    }

    /**
     * Auxiliary method for extracting information from a pattern.
     *
     * @param pattern     search pattern
     * @param inputPhrase attribute containing phrase received
     * @return returns list of strings
     */
    public static List<String> searchEngine(String pattern, String inputPhrase) {

        List<String> matches = new ArrayList<>();
        Matcher matcher = Pattern.compile(pattern).matcher(inputPhrase);

        while (matcher.find()) {
            matches.add(matcher.group().trim());
        }

        if (matches.isEmpty()) {
            GeneralExceptionUtils.error();
        }

        return matches;
    }
}
