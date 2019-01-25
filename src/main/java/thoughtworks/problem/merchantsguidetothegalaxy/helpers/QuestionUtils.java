package thoughtworks.problem.merchantsguidetothegalaxy.helpers;

import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.enums.InputTypeEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A utilitarian method that contains rules for extraction and treatment of issues.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class QuestionUtils {

    private static final String HOW = "how";
    private static final String MUCH_IS = "much is";
    private static final String MANY_CREDITS = "many Credits";
    private static final String PATTERN_QUESTION_HOW_ROMAN = "is [a-z ]+ ";
    private static final String _IS_ = " is ";
    private static final String IS_ = "is ";
    private static final String PATTERN_QUESTION_HOW_MUCH_MATERIAL = "[A-Z]+[a-z]+";
    private static final String CREDITS = " Credits";

    /**
     * This method validates whether input is an issue.
     *
     * @return returns true if it is a question and false if it is not
     */
    public static boolean isQuestion(String value) {

        return Objects.nonNull(value)
                ? (value.equals(HOW)
                ? Boolean.TRUE
                : Boolean.FALSE) : Boolean.FALSE;
    }

    /**
     * Method that evaluates what type of question was received.
     *
     * @param values values in array format
     * @return returns question type {@link InputTypeEnum}
     */
    public static InputTypeEnum defineInputTypeQuestion(String... values) {

        String question = values[1] + StringUtils.ONE_SPACE + values[2];

        if (MUCH_IS.equals(question)) {
            return InputTypeEnum.HOW_MUCH_IS;

        } else if (MANY_CREDITS.equals(question)) {
            return InputTypeEnum.HOW_MANY_CREDITS_IS;
        }

        return null;
    }

    /**
     * Method that extracts Roman numbers from a question.
     *
     * @param input type object {@link InputModel}
     * @return returns Roman numbers found
     */
    public static String getRomans(InputModel input) {

        List<String> matches = new ArrayList<>();
        Matcher matcher = Pattern.compile(PATTERN_QUESTION_HOW_ROMAN).matcher(input.getInputPhrase());

        while (matcher.find()) {
            matches.add(matcher.group().trim());
        }

        return matches.get(0)
                .replace(IS_, StringUtils.ONE_SPACE)
                .trim();
    }

    /**
     * Method that extracts material from a question.
     *
     * @param input type object {@link InputModel}
     * @return returns material found
     */
    public static String getMaterial(InputModel input) {
        List<String> matches = new ArrayList<>();
        Matcher matcher = Pattern.compile(PATTERN_QUESTION_HOW_MUCH_MATERIAL).matcher(input.getInputPhrase());

        while (matcher.find()) {
            matches.add(matcher.group().trim());
        }

        return matches.get(1);
    }

    /**
     * Method that forms question answer how much.
     *
     * @param romans string containing Roman number
     * @param result string containing the result
     * @return returns the answer of the formed question.
     */
    public static String formatQuestionHowMuch(String romans, String result) {
        return romans + _IS_ + result;
    }

    /**
     * Method that forms question answer to how many Credits.
     *
     * @param romanDetail  string containing Roman number
     * @param material     string containing the material
     * @param creditResult string containing the credit result
     * @return returns the answer of the formed question.
     */
    public static String formatQuestionHowManyCredits(String romanDetail, String material, int creditResult) {
        return romanDetail + StringUtils.ONE_SPACE + material + _IS_ + creditResult + CREDITS;
    }
}
