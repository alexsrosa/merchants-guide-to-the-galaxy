package thoughtworks.problem.merchantsguidetothegalaxy.business.services;

import thoughtworks.problem.merchantsguidetothegalaxy.business.repositories.AbstractRepository;
import thoughtworks.problem.merchantsguidetothegalaxy.model.AbstractModel;

/**
 * Abstract class that holds rules most used for standard service.
 *
 * @param <C> type Model Object {@link AbstractModel}
 * @param <I> type id
 * @param <R> type repository {@link AbstractRepository}
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public abstract class AbstractService<C extends AbstractModel, I, R extends AbstractRepository<C, I>> {

    /**
     * Method that returns the repository to be used.
     *
     * @return object type {@link R}
     */
    public abstract R getRepository();

    /**
     * Method to be implemented for save action.
     *
     * @param clazz object to be saved {@link C}
     */
    public void save(C clazz) {
        getRepository().save(clazz);
    }

    /**
     * Method to be implemented to search for a record.
     *
     * @param id object to be find {@link I}
     */
    public C findOne(I id) {
        return getRepository().findOne(id);
    }

    /**
     * Method to be implemented for delete action.
     *
     * @param id object to be deleted {@link I}
     */
    public void delete(I id) {
        getRepository().delete(id);
    }

    /**
     * Method that checks whether the fetched value exists.
     *
     * @param id object to be find {@link I}
     * @return true when exists or false when not exists
     */
    public boolean exists(I id) {
        return getRepository().exists(id);
    }
}
