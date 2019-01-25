package thoughtworks.problem.merchantsguidetothegalaxy.general;

import org.junit.Test;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.enums.InputTypeEnum;

import static org.junit.Assert.assertEquals;

public class IdentifyQuestionsTest {

    @Test
    public void identifyHowMuchIsTest() {

        InputModel input = new InputModel("how much is pish tegj glob glob ?");
        assertEquals(input.getInputType(), InputTypeEnum.HOW_MUCH_IS);
    }

    @Test
    public void identifyHowManyCreditsIsTest() {

        InputModel input = new InputModel("how many Credits is glob prok Silver ?");
        assertEquals(input.getInputType(), InputTypeEnum.HOW_MANY_CREDITS_IS);
    }

    @Test(expected = RuntimeException.class)
    public void identifyQuestionErrorTest() {

        new InputModel("how much wood could a woodchuck chuck if a woodchuck could chuck wood ?");
    }
}
