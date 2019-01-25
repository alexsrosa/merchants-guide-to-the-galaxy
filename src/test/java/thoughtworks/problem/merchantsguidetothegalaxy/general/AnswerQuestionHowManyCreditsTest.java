package thoughtworks.problem.merchantsguidetothegalaxy.general;

import org.junit.Before;
import org.junit.Test;
import thoughtworks.problem.merchantsguidetothegalaxy.business.services.CreditService;
import thoughtworks.problem.merchantsguidetothegalaxy.business.services.ParameterService;
import thoughtworks.problem.merchantsguidetothegalaxy.model.CreditModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.ParameterModel;

import static org.junit.Assert.assertEquals;

public class AnswerQuestionHowManyCreditsTest {

    @Before
    public void init() {
        ParameterService parameterService = new ParameterService();
        parameterService.save(new ParameterModel(new InputModel("glob is I")));
        parameterService.save(new ParameterModel(new InputModel("prok is V")));
        parameterService.save(new ParameterModel(new InputModel("pish is X")));
        parameterService.save(new ParameterModel(new InputModel("tegj is L")));
        parameterService.save(new ParameterModel(new InputModel("othf is C")));
        parameterService.save(new ParameterModel(new InputModel("rrrer is M")));
        parameterService.save(new ParameterModel(new InputModel("fted is D")));

        CreditService creditService = new CreditService();
        creditService.save(new CreditModel(new InputModel("glob glob Silver is 34 Credits")));
        creditService.save(new CreditModel(new InputModel("glob prok Gold is 57800 Credits")));
        creditService.save(new CreditModel(new InputModel("pish pish Iron is 3910 Credits")));
    }

    @Test
    public void answerQuestionHowManyCreditsSuccessTest() {
        String answer = new InputModel("how many Credits is glob prok Silver ?").executeStrategy();
        assertEquals("glob prok Silver is 68 Credits", answer);
    }

    @Test
    public void answerQuestionHowManyCreditsSuccess2Test() {
        String answer = new InputModel("how many Credits is glob prok Gold ?").executeStrategy();
        assertEquals("glob prok Gold is 57800 Credits", answer);
    }

    @Test
    public void answerQuestionHowManyCreditsSuccess3Test() {
        String answer = new InputModel("how many Credits is glob prok Iron ?").executeStrategy();
        assertEquals("glob prok Iron is 782 Credits", answer);
    }
}
