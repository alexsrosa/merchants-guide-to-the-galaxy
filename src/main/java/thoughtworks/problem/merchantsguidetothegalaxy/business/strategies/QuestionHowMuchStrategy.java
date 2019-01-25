package thoughtworks.problem.merchantsguidetothegalaxy.business.strategies;

import thoughtworks.problem.merchantsguidetothegalaxy.helpers.QuestionUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.RomanUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.QuestionHowMuchModel;

/**
 * Class containing execution strategy if it is identified that a question was received.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class QuestionHowMuchStrategy implements StrategyInterface {

    @Override
    public String run(InputModel input) {

        QuestionHowMuchModel model = new QuestionHowMuchModel(input);
        return QuestionUtils.formatQuestionHowMuch(model.getRomans(),
                RomanUtils.calculate(model.getRomans()).toString());
    }
}
