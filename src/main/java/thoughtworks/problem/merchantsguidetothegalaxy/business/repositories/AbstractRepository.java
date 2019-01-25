package thoughtworks.problem.merchantsguidetothegalaxy.business.repositories;

import thoughtworks.problem.merchantsguidetothegalaxy.model.AbstractModel;

import java.util.Map;

/**
 * Repository interface that implements.
 *
 * @param <C> sets model that type {@link AbstractModel}
 * @param <I> sets the id of the model
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public abstract class AbstractRepository<C extends AbstractModel, I> {

    /**
     * Abstraction of map that stores information.
     *
     * @return the map
     */
    protected abstract Map<I, C> getMap();

    /**
     * Method to be implemented for save action.
     *
     * @param clazz object to be saved {@link C}
     */
    public void save(C clazz) {
        getMap().put((I) clazz.getId(), clazz);
    }

    /**
     * Method to be implemented for delete action.
     *
     * @param id object to be deleted {@link I}
     */
    public void delete(I id) {
        getMap().remove(id);
    }

    /**
     * Method to be implemented to search for a record.
     *
     * @param id object to be find {@link I}
     */
    public C findOne(I id) {
        return getMap().get(id);
    }

    /**
     * Method that checks whether the fetched value exists.
     *
     * @param id object to be find {@link I}
     * @return true when exists or false when not exists
     */
    public boolean exists(I id) {
        return getMap().containsKey(id);
    }
}
