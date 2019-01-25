package thoughtworks.problem.merchantsguidetothegalaxy.exception;

/**
 * Utility class for exceptions.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class GeneralExceptionUtils {

    public static final String I_HAVE_NO_IDEA_WHAT_YOU_ARE_TALKING_ABOUT = "I have no idea what you are talking about";

    /**
     * Exception utility method.
     */
    public static void error() {
        throw new BusinessException(I_HAVE_NO_IDEA_WHAT_YOU_ARE_TALKING_ABOUT);
    }
}
