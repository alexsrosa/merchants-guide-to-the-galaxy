package thoughtworks.problem.merchantsguidetothegalaxy.business.processors;

import thoughtworks.problem.merchantsguidetothegalaxy.exception.BusinessException;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.MessageUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.StringUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;

/**
 * InputModel processing class.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class InputProcessor {

    /**
     * Main method of execution of the input process.
     *
     * @param inputPhrase InputModel phrase
     */
    public static void run(String inputPhrase) {

        String returnMessage;

        try {
            InputModel input = new InputModel(inputPhrase);
            returnMessage = input.executeStrategy();

        } catch (BusinessException e) {
            returnMessage = e.getMessage();
        }

        showMessage(returnMessage);
    }

    /**
     * Auxiliary method for displaying the processed message.
     *
     * @param returnMessage return message
     */
    private static void showMessage(String returnMessage) {
        if (!StringUtils.ONE_SPACE.equals(returnMessage)) {
            MessageUtils.newMessage(returnMessage);
        }
    }
}
