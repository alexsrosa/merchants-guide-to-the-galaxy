package thoughtworks.problem.merchantsguidetothegalaxy.general;

import org.junit.Test;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.enums.InputTypeEnum;

import static org.junit.Assert.assertEquals;

public class IdentifyParameterTest {

    @Test
    public void identifyParameterTest() {

        InputTypeEnum inputType = new InputModel("tegj is L").getInputType();
        assertEquals(inputType, InputTypeEnum.PARAM);
    }
}
