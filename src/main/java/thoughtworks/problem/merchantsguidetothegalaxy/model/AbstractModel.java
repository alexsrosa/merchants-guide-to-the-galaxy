package thoughtworks.problem.merchantsguidetothegalaxy.model;

/**
 * Abstract class of data model.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public abstract class AbstractModel<S> {

    /**
     * Method that always returns the identifier of the template.
     *
     * @return identifier of the model.
     */
    public abstract S getId();
}
