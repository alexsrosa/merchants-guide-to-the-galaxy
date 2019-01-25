package thoughtworks.problem.merchantsguidetothegalaxy.business.services;

import thoughtworks.problem.merchantsguidetothegalaxy.business.repositories.CreditRepository;
import thoughtworks.problem.merchantsguidetothegalaxy.model.CreditModel;

/**
 * Class of credit service that holds business rules for access to the repository.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class CreditService extends AbstractService<CreditModel, String, CreditRepository> {

    @Override
    public CreditRepository getRepository() {
        return new CreditRepository();
    }
}
