package thoughtworks.problem.merchantsguidetothegalaxy.model;

import thoughtworks.problem.merchantsguidetothegalaxy.helpers.ParameterUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.model.enums.RomanNumeralsEnum;

/**
 * Parameter model class.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class ParameterModel extends AbstractModel<String> {

    private String name;
    private RomanNumeralsEnum romanNumeralsEnum;

    public ParameterModel(InputModel input) {
        this.name = ParameterUtils.getParameterName(input);
        this.romanNumeralsEnum = RomanNumeralsEnum.getEnumByName(ParameterUtils.getValue(input));
    }

    @Override
    public String getId() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RomanNumeralsEnum getRomanNumeralsEnum() {
        return romanNumeralsEnum;
    }

    public void setRomanNumeralsEnum(RomanNumeralsEnum romanNumeralsEnum) {
        this.romanNumeralsEnum = romanNumeralsEnum;
    }
}
