package thoughtworks.problem.merchantsguidetothegalaxy.business.strategies;

import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;

/**
 * Standard interface of strategies.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public interface StrategyInterface {

    /**
     * Main method for executing the strategy.
     *
     * @param input parameter type {@link InputModel}
     * @return return string
     */
    String run(InputModel input);
}
