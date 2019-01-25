package thoughtworks.problem.merchantsguidetothegalaxy.business.repositories;

import thoughtworks.problem.merchantsguidetothegalaxy.model.CreditModel;

import java.util.HashMap;
import java.util.Map;

/**
 * Repository class that implements {@link AbstractRepository}.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class CreditRepository extends AbstractRepository<CreditModel, String> {

    private static Map<String, CreditModel> credits = new HashMap<>();

    @Override
    public Map<String, CreditModel> getMap() {
        return credits;
    }

    @Override
    public void save(CreditModel credit) {
        if (exists(credit.getMaterial())) {
            delete(credit.getMaterial());
        }

        super.save(credit);
    }

    @Override
    public CreditModel findOne(String material) {
        if (!exists(material)) {
            return null;
        }
        return super.findOne(material);
    }
}
