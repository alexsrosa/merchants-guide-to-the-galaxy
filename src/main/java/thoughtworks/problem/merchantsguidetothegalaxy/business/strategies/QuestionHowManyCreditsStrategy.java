package thoughtworks.problem.merchantsguidetothegalaxy.business.strategies;

import thoughtworks.problem.merchantsguidetothegalaxy.business.services.CreditService;
import thoughtworks.problem.merchantsguidetothegalaxy.exception.GeneralExceptionUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.CreditUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.QuestionUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.RomanUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.model.CreditModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.QuestionHowManyCreditsModel;

import java.util.Objects;

/**
 * Class containing execution strategy if it is identified that a question was received.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class QuestionHowManyCreditsStrategy implements StrategyInterface {

    private final CreditService creditService;

    public QuestionHowManyCreditsStrategy() {
        this.creditService = new CreditService();
    }

    @Override
    public String run(InputModel input) {

        QuestionHowManyCreditsModel model = new QuestionHowManyCreditsModel(input);

        int calculate = RomanUtils.calculate(model.getRomanDetail());
        CreditModel credit = creditService.findOne(model.getMaterial());

        if (Objects.isNull(credit)) {
            GeneralExceptionUtils.error();
        }

        return QuestionUtils.formatQuestionHowManyCredits(model.getRomanDetail(), model.getMaterial(),
                CreditUtils.calculateCredits(credit.getUnitaryValue(), calculate));
    }
}
