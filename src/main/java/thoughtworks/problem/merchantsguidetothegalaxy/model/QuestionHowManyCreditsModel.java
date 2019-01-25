package thoughtworks.problem.merchantsguidetothegalaxy.model;

import thoughtworks.problem.merchantsguidetothegalaxy.helpers.QuestionUtils;

/**
 * Question template class for how many Credits.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class QuestionHowManyCreditsModel {

    private String material;
    private String romanDetail;

    public QuestionHowManyCreditsModel(InputModel input) {

        this.material = QuestionUtils.getMaterial(input);
        this.romanDetail = QuestionUtils.getRomans(input);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRomanDetail() {
        return romanDetail;
    }

    public void setRomanDetail(String romanDetail) {
        this.romanDetail = romanDetail;
    }
}
