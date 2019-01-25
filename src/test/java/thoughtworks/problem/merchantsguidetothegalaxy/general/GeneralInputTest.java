package thoughtworks.problem.merchantsguidetothegalaxy.general;

import org.junit.Assert;
import org.junit.Test;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.StringUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.enums.InputTypeEnum;

public class GeneralInputTest {

    @Test
    public void identifierParamTest() {
        Assert.assertEquals(InputTypeEnum.PARAM, new InputModel("glob is I").getInputType());
    }

    @Test
    public void identifierQuestionTest() {

        Assert.assertEquals(Boolean.TRUE,
                new InputModel("how much is pish tegj glob glob ?").isQuestion());
    }

    @Test(expected = RuntimeException.class)
    public void errorRandomQuestionTest() {
        new InputModel("HOW IS I3w");
    }

    @Test(expected = RuntimeException.class)
    public void errorStringEmptyTest() {

        new InputModel(StringUtils.ONE_SPACE);
    }

    @Test(expected = RuntimeException.class)
    public void errorRandomStringTest() {
        new InputModel("123123 asdas d324ef  ewre sdasd as");
    }

    @Test(expected = RuntimeException.class)
    public void errorRandom2StringTest() {
        new InputModel("asd asdas d sd as dasd sadas");
    }

    @Test(expected = RuntimeException.class)
    public void errorRandom3StringTest() {
        new InputModel("Vasdas Rdf I");
    }

    @Test(expected = RuntimeException.class)
    public void errorRandom4StringTest() {
        new InputModel("Vasdas IS I3w");
    }


}
