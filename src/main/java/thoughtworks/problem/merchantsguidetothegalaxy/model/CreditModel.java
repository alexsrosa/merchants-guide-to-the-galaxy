package thoughtworks.problem.merchantsguidetothegalaxy.model;

import thoughtworks.problem.merchantsguidetothegalaxy.exception.GeneralExceptionUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.CreditUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.RomanUtils;

/**
 * Class of credit model.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class CreditModel extends AbstractModel<String> {

    private String material;
    private double creditValue;
    private String creditDetail;
    private double unitaryValue;

    public CreditModel(InputModel input) {
        this.material = CreditUtils.getMaterial(input.getInputPhrase());
        this.creditValue = Integer.valueOf(CreditUtils.getCreditValue(input.getInputPhrase()));
        this.creditDetail = CreditUtils.getCreditDetail(input.getInputPhrase());

        try {
            this.unitaryValue = this.creditValue / RomanUtils.calculate(this.creditDetail);
        } catch (Exception e) {
            GeneralExceptionUtils.error();
        }
    }

    @Override
    public String getId() {
        return material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(double creditValue) {
        this.creditValue = creditValue;
    }

    public String getCreditDetail() {
        return creditDetail;
    }

    public void setCreditDetail(String creditDetail) {
        this.creditDetail = creditDetail;
    }

    public double getUnitaryValue() {
        return unitaryValue;
    }

    public void setUnitaryValue(double unitaryValue) {
        this.unitaryValue = unitaryValue;
    }


}
