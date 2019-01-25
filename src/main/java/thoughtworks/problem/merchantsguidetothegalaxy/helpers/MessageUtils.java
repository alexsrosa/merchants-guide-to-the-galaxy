package thoughtworks.problem.merchantsguidetothegalaxy.helpers;

/**
 * Utilities class for messages.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class MessageUtils {

    private static final String WELCOME_TO_MERCHANT_S_GUIDE_TO_THE_GALAXY = "Welcome to Merchant's Guide to the "
            + "Galaxy!";
    private static final String TIP_TYPE_A_COMMAND_AND_THEN_CLICK_ENTER = "Tip: Type a command and then click ENTER";
    private static final String TIP_TO_END_THE_APPLICATION_TYPE_EXIT_AND_CLICK_ENTER = "Tip: To end the application "
            + "type 'exit' and click ENTER";
    private static final String YOU_RE_BEING_DISCONNECTED_GOODBYE = "You're being disconnected, goodbye.";
    private static final String SUCCESS = "[SUCCESS]";
    private static final String INSERTED = "inserted!";

    public static final String PARAMETER = "Parameter";
    public static final String CREDITS = "Credits";
    public static final String EXIT = "exit";

    /**
     * Method that displays the welcome message.
     */
    public static void welcome() {
        newMessage(WELCOME_TO_MERCHANT_S_GUIDE_TO_THE_GALAXY);
        newMessage(TIP_TYPE_A_COMMAND_AND_THEN_CLICK_ENTER);
        newMessage(TIP_TO_END_THE_APPLICATION_TYPE_EXIT_AND_CLICK_ENTER);
    }

    /**
     * Method that displays the closing message.
     */
    public static void close() {
        newMessage(YOU_RE_BEING_DISCONNECTED_GOODBYE);
    }

    /**
     * Method that effectively creates the message.
     *
     * @param message message received
     */
    public static void newMessage(String message) {
        System.out.println(message);
    }

    /**
     * Method that creates a message of success.
     *
     * @param message message received
     * @return return message
     */
    public static String messageSuccess(String message) {
        return SUCCESS.concat(StringUtils.ONE_SPACE)
                .concat(message).concat(StringUtils.ONE_SPACE)
                .concat(INSERTED);
    }
}
