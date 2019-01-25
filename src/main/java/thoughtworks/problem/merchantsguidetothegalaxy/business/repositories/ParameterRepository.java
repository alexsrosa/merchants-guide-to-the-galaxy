package thoughtworks.problem.merchantsguidetothegalaxy.business.repositories;

import thoughtworks.problem.merchantsguidetothegalaxy.model.ParameterModel;

import java.util.HashMap;
import java.util.Map;

/**
 * Repository class that implements {@link AbstractRepository}.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class ParameterRepository extends AbstractRepository<ParameterModel, String> {

    private static Map<String, ParameterModel> parameters = new HashMap<>();

    @Override
    public Map<String, ParameterModel> getMap() {
        return parameters;
    }

    @Override
    public void save(ParameterModel parameter) {
        if (exists(parameter.getName())) {
            delete(parameter.getName());
        }
        super.save(parameter);
    }

    @Override
    public ParameterModel findOne(String name) {
        if (!exists(name)) {
            return null;
        }
        return super.findOne(name);
    }
}
