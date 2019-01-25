package thoughtworks.problem.merchantsguidetothegalaxy.exception;

/**
 * Implementation for system business exceptions.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 3778719570096441666L;

    BusinessException(String message) {
        super(message);
    }
}