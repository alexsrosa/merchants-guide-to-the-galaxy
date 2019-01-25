package thoughtworks.problem.merchantsguidetothegalaxy.general;

import org.junit.Before;
import org.junit.Test;
import thoughtworks.problem.merchantsguidetothegalaxy.business.services.ParameterService;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.ParameterModel;

import static org.junit.Assert.assertEquals;

public class AnswerQuestionHowMuchTest {

    @Before
    public void init() {
        ParameterService service = new ParameterService();
        service.save(new ParameterModel(new InputModel("glob is I")));
        service.save(new ParameterModel(new InputModel("prok is V")));
        service.save(new ParameterModel(new InputModel("pish is X")));
        service.save(new ParameterModel(new InputModel("tegj is L")));
        service.save(new ParameterModel(new InputModel("othf is C")));
        service.save(new ParameterModel(new InputModel("rrrer is M")));
        service.save(new ParameterModel(new InputModel("fted is D")));
    }

    @Test
    public void answerQuestion1Test() {
        String answer = new InputModel("how much is pish tegj glob glob ?").executeStrategy();
        assertEquals("pish tegj glob glob is 42", answer);
    }

    @Test
    public void answerQuestion2Test() {
        String answer = new InputModel("how much is pish tegj glob prok ?").executeStrategy();
        assertEquals("pish tegj glob prok is 44", answer);
    }

    @Test
    public void answerQuestion3Test() {
        String answer = new InputModel("how much is othf pish glob prok ?").executeStrategy();
        assertEquals("othf pish glob prok is 114", answer);
    }

    @Test
    public void answerQuestion4Test() {
        String answer = new InputModel("how much is rrrer othf rrrer tegj ?").executeStrategy(); // MCML
        assertEquals("rrrer othf rrrer tegj is 1950", answer);
    }

    @Test(expected = RuntimeException.class)
    public void answerQuestionWithErroMaxRomanTest() {
        new InputModel("how much is tegj othf tegj tegj ?").executeStrategy(); // LCLL
    }

    /**
     * Test roman VVLI.
     */
    @Test(expected = RuntimeException.class)
    public void answerQuestionWithErroMax2RomanTest() {
        new InputModel("how much is prok prok tegj glob ?").executeStrategy();
    }

    /**
     * Test roman MMM.
     */
    @Test
    public void answerQuestionWithSuccessConsecutive1RomanTest() {
        String answer = new InputModel("how much is rrrer rrrer rrrer ?").executeStrategy();
        assertEquals("rrrer rrrer rrrer is 3000", answer);
    }

    /**
     * Test roman MMMM.
     */
    @Test(expected = RuntimeException.class)
    public void answerQuestionWithErrorConsecutiveMMMMRomanTest() {
        new InputModel("how much is rrrer rrrer rrrer rrrer ?").executeStrategy();
    }

    /**
     * Test roman XXXIX.
     */
    @Test
    public void answerQuestionWithSuccessConsecutiveXXXIXRomanTest() {
        String answer = new InputModel("how much is pish pish pish glob pish ?").executeStrategy();
        assertEquals("pish pish pish glob pish is 39", answer);
    }

    /**
     * Test roman XXXIXX.
     */
    @Test(expected = RuntimeException.class)
    public void answerQuestionWithSuccessConsecutiveXXXIXXRomanTest() {
        new InputModel("how much is pish pish pish glob pish pish ?").executeStrategy();
    }

    /**
     * Test roman VX.
     */
    @Test(expected = RuntimeException.class)
    public void answerQuestionWithErrorSubtractedByVXRomanTest() {
        new InputModel("how much is prok pish ?").executeStrategy();
    }

    /**
     * Test roman MLC.
     */
    @Test(expected = RuntimeException.class)
    public void answerQuestionWithErrorSubtractedByMLCRomanTest() {
        new InputModel("how much is rrrer tegj othf ?").executeStrategy();
    }

    /**
     * Test roman DM.
     */
    @Test(expected = RuntimeException.class)
    public void answerQuestionWithErrorSubtractedByDMRomanTest() {
        new InputModel("how much is fted rrrer ?").executeStrategy();
    }

    /**
     * Test roman IL.
     */
    @Test(expected = RuntimeException.class)
    public void answerQuestionWithErrorSubtractedByILRomanTest() {
        new InputModel("how much is glob tegj ?").executeStrategy();
    }


    /**
     * Test roman LD.
     */
    @Test(expected = RuntimeException.class)
    public void answerQuestionWithErrorSubtractedByLDRomanTest() {
        new InputModel("how much is tegj fted ?").executeStrategy();
    }
}
