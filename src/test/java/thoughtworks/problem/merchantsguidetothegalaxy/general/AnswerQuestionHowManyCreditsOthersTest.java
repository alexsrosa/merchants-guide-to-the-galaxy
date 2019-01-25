package thoughtworks.problem.merchantsguidetothegalaxy.general;

import org.junit.Before;
import org.junit.Test;
import thoughtworks.problem.merchantsguidetothegalaxy.business.services.CreditService;
import thoughtworks.problem.merchantsguidetothegalaxy.business.services.ParameterService;
import thoughtworks.problem.merchantsguidetothegalaxy.model.CreditModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.ParameterModel;

import static org.junit.Assert.assertEquals;

public class AnswerQuestionHowManyCreditsOthersTest {

    @Before
    public void init() {
        ParameterService parameterService = new ParameterService();
        parameterService.save(new ParameterModel(new InputModel("chan is I")));
        parameterService.save(new ParameterModel(new InputModel("duvc is V")));
        parameterService.save(new ParameterModel(new InputModel("zuca is X")));
        parameterService.save(new ParameterModel(new InputModel("cong is L")));
        parameterService.save(new ParameterModel(new InputModel("rura is C")));
        parameterService.save(new ParameterModel(new InputModel("odse is D")));
        parameterService.save(new ParameterModel(new InputModel("weee is M")));

        CreditService creditService = new CreditService();
        creditService.save(new CreditModel(new InputModel("odse cong zuca chan chan Silver is 95 Credits")));
        creditService.save(new CreditModel(new InputModel("weee weee weee odse zuca cong chan zuca Gold is 876 Credits")));
        creditService.save(new CreditModel(new InputModel("weee weee odse cong zuca chan zuca Iron is 3910 Credits")));
    }

    @Test
    public void answerQuestionHowMuchSuccessTest() {
        String answer = new InputModel("how much is odse rura cong zuca zuca duvc chan chan chan ?").executeStrategy();
        assertEquals("odse rura cong zuca zuca duvc chan chan chan is 678", answer);
    }

    @Test
    public void answerQuestionHowMuchSuccess2Test() {
        String answer = new InputModel("how much is weee weee weee odse rura rura cong zuca duvc chan chan ?").executeStrategy();
        assertEquals("weee weee weee odse rura rura cong zuca duvc chan chan is 3767", answer);
    }

    @Test
    public void answerQuestionHowManyCreditsSuccess1Test() {
        String answer = new InputModel("how many Credits is odse cong zuca chan chan Silver ?").executeStrategy();
        assertEquals("odse cong zuca chan chan Silver is 95 Credits", answer);
    }

    @Test
    public void answerQuestionHowManyCreditsSuccess2Test() {
        String answer = new InputModel("how many Credits is zuca zuca duvc chan chan Silver ?").executeStrategy();
        assertEquals("zuca zuca duvc chan chan Silver is 4 Credits", answer);
    }
}
