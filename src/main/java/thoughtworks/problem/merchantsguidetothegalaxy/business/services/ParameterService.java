package thoughtworks.problem.merchantsguidetothegalaxy.business.services;

import thoughtworks.problem.merchantsguidetothegalaxy.business.repositories.ParameterRepository;
import thoughtworks.problem.merchantsguidetothegalaxy.model.ParameterModel;

/**
 * Class of parameter service that holds business rules for access to the repository.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class ParameterService extends AbstractService<ParameterModel, String, ParameterRepository> {

    @Override
    public ParameterRepository getRepository() {
        return new ParameterRepository();
    }
}
