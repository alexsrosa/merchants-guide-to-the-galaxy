package thoughtworks.problem.merchantsguidetothegalaxy.business.strategies;

import thoughtworks.problem.merchantsguidetothegalaxy.business.services.CreditService;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.MessageUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.model.CreditModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;

/**
 * Class that contains execution strategy if it is identified that a credit parameter has been received.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class CreditStrategy implements StrategyInterface {

    private final CreditService creditService;

    public CreditStrategy() {
        this.creditService = new CreditService();
    }

    @Override
    public String run(InputModel input) {

        creditService.save(new CreditModel(input));
        return MessageUtils.messageSuccess(MessageUtils.CREDITS);
    }
}
