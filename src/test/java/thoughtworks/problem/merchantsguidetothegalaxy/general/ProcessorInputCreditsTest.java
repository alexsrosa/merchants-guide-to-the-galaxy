package thoughtworks.problem.merchantsguidetothegalaxy.general;

import org.junit.Test;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.CreditUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.enums.InputTypeEnum;

import static org.junit.Assert.assertEquals;

public class ProcessorInputCreditsTest {

    @Test
    public void getCreditDetailTest() {

        InputModel input = new InputModel("glob glob Silver is 34 Credit");

        InputTypeEnum inputTypeEnum = input.getInputType();
        assertEquals(InputTypeEnum.CREDITS, inputTypeEnum);

        String parameterName = CreditUtils.getCreditDetail(input.getInputPhrase());
        assertEquals("glob glob", parameterName);
    }

    @Test
    public void getCreditDetailNotFoundTest() {

        InputModel input = new InputModel("Silver is 34 Credit");

        InputTypeEnum inputTypeEnum = input.getInputType();
        assertEquals(InputTypeEnum.CREDITS, inputTypeEnum);

        CreditUtils.getCreditDetail(input.getInputPhrase());
    }

    @Test
    public void getCreditValueTest() {

        InputModel input = new InputModel("glob glob Silver is 34 Credit");

        InputTypeEnum inputTypeEnum = input.getInputType();
        assertEquals(InputTypeEnum.CREDITS, inputTypeEnum);

        String value = CreditUtils.getCreditValue(input.getInputPhrase());
        assertEquals("34", value);
    }

    @Test(expected = RuntimeException.class)
    public void getCreditValueNotFoundTest() {

        InputModel input = new InputModel("glob glob Silver is Credit");

        InputTypeEnum inputTypeEnum = input.getInputType();
        assertEquals(InputTypeEnum.CREDITS, inputTypeEnum);

        CreditUtils.getCreditValue(input.getInputPhrase());
    }

    @Test
    public void getGetMaterialTest() {

        InputModel input = new InputModel("glob glob Silver is 34 Credit");

        InputTypeEnum inputTypeEnum = input.getInputType();
        assertEquals(InputTypeEnum.CREDITS, inputTypeEnum);

        String value = CreditUtils.getMaterial(input.getInputPhrase());
        assertEquals("Silver", value);
    }

    @Test(expected = RuntimeException.class)
    public void getGetMaterialNotFoundTest() {

        InputModel input = new InputModel("glob glob ilver is 34 Credit");

        InputTypeEnum inputTypeEnum = input.getInputType();
        assertEquals(InputTypeEnum.CREDITS, inputTypeEnum);

        CreditUtils.getMaterial(input.getInputPhrase());
    }
}
