package thoughtworks.problem.merchantsguidetothegalaxy.service;

import org.junit.Before;
import org.junit.Test;
import thoughtworks.problem.merchantsguidetothegalaxy.business.services.CreditService;
import thoughtworks.problem.merchantsguidetothegalaxy.model.CreditModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;

import static org.junit.Assert.assertEquals;

public class CreditsServiceTest {
    private CreditService service;
    private CreditModel CreditOne;

    @Before
    public void init() {
        service = new CreditService();
        CreditOne = new CreditModel(new InputModel("glob glob Silver is 34 Credits"));
    }

    @Test
    public void addNewCreditTest() {

        service.save(CreditOne);
        CreditModel one = service.findOne(CreditOne.getMaterial());
        assertEquals(one.getMaterial(), CreditOne.getMaterial());
    }

    @Test
    public void deleteCreditTest() {

        service.save(CreditOne);
        CreditModel one = service.findOne(CreditOne.getMaterial());

        assertEquals(one.getMaterial(), CreditOne.getMaterial());

        service.delete(CreditOne.getMaterial());

        CreditModel one2 = service.findOne(CreditOne.getMaterial());
        assertEquals(one2, null);
    }

    @Test
    public void addDuplicateCreditTest() {

        service.save(CreditOne);
        CreditModel one = service.findOne(CreditOne.getMaterial());
        assertEquals(one.getMaterial(), CreditOne.getMaterial());

        CreditModel CreditTwo = new CreditModel(new InputModel("glob glob Silver is 89 Credits"));
        service.save(CreditTwo);
        CreditModel two = service.findOne(CreditOne.getMaterial());
        assertEquals(two.getMaterial(), CreditTwo.getMaterial());
    }

    @Test
    public void addManyCreditTest() {

        service.save(CreditOne);
        CreditModel CreditTwo = new CreditModel(new InputModel("glob prok Gold is 57800 Credits"));
        service.save(CreditTwo);
        CreditModel CreditThree = new CreditModel(new InputModel("pish pish Iron is 3910 Credits"));
        service.save(CreditThree);
        CreditModel CreditFour = new CreditModel(new InputModel("pish glob Gold is 344 Credits"));
        service.save(CreditFour);

        assertEquals(service.exists("Gold"), Boolean.TRUE);
        assertEquals(service.exists("Iron222"), Boolean.FALSE);
        assertEquals(service.exists("Gold"), Boolean.TRUE);
        assertEquals(service.exists("Iron"), Boolean.TRUE);
        assertEquals(service.exists("Gold2"), Boolean.FALSE);
    }
}
