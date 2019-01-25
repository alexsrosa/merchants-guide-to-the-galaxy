package thoughtworks.problem.merchantsguidetothegalaxy.business.strategies;

import thoughtworks.problem.merchantsguidetothegalaxy.business.services.ParameterService;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.MessageUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.ParameterModel;

/**
 * Class that contains execution strategy if it is identified that a parameter has been received.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class ParameterStrategy implements StrategyInterface {

    private final ParameterService parameterService;

    public ParameterStrategy() {
        this.parameterService = new ParameterService();
    }

    @Override
    public String run(InputModel input) {

        parameterService.save(new ParameterModel(input));
        return MessageUtils.messageSuccess(MessageUtils.PARAMETER);
    }
}
