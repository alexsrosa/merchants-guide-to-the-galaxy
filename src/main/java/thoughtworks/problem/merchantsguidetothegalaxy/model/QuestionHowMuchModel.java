package thoughtworks.problem.merchantsguidetothegalaxy.model;

import thoughtworks.problem.merchantsguidetothegalaxy.helpers.QuestionUtils;

/**
 * Question template class for how much.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class QuestionHowMuchModel {

    private String romans;

    public QuestionHowMuchModel(InputModel input) {
        this.romans = QuestionUtils.getRomans(input);
    }

    public String getRomans() {
        return romans;
    }
}
