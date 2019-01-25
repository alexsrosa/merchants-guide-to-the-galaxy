package thoughtworks.problem.merchantsguidetothegalaxy.general;

import org.junit.Before;
import org.junit.Test;
import thoughtworks.problem.merchantsguidetothegalaxy.business.services.ParameterService;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.ParameterModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.enums.InputTypeEnum;
import thoughtworks.problem.merchantsguidetothegalaxy.model.enums.RomanNumeralsEnum;

import static org.junit.Assert.assertEquals;

public class ProcessorInputParameterTest {

    private InputModel input;
    private ParameterModel parameter;

    @Before
    public void defaultCreate() {
        input = new InputModel("glob is I");
        assertEquals(InputTypeEnum.PARAM, input.getInputType());
        parameter = new ParameterModel(input);
    }

    @Test
    public void createParameterTest() {

        assertEquals("glob", parameter.getName());
        assertEquals(RomanNumeralsEnum.I, parameter.getRomanNumeralsEnum());
    }

    @Test
    public void addNewParameterTest() {

        ParameterService parameterService = new ParameterService();
        parameterService.save(parameter);
    }
}
