package thoughtworks.problem.merchantsguidetothegalaxy.service;

import org.junit.Before;
import org.junit.Test;
import thoughtworks.problem.merchantsguidetothegalaxy.business.services.ParameterService;
import thoughtworks.problem.merchantsguidetothegalaxy.model.InputModel;
import thoughtworks.problem.merchantsguidetothegalaxy.model.ParameterModel;

import static org.junit.Assert.assertEquals;

public class ParameterServiceTest {

    private ParameterService service;
    private ParameterModel parameterOne;

    @Before
    public void init() {
        service = new ParameterService();
        parameterOne = new ParameterModel(new InputModel("glob is I"));
    }

    @Test
    public void addNewParameterTest() {

        service.save(parameterOne);
        ParameterModel one = service.findOne(parameterOne.getName());
        assertEquals(one.getName(), parameterOne.getName());
    }

    @Test
    public void deleteParameterTest() {

        service.save(parameterOne);
        ParameterModel one = service.findOne(parameterOne.getName());

        assertEquals(one.getName(), parameterOne.getName());

        service.delete(parameterOne.getName());

        ParameterModel one2 = service.findOne(parameterOne.getName());
        assertEquals(one2, null);
    }

    @Test
    public void addDuplicateParameterTest() {

        service.save(parameterOne);
        ParameterModel one = service.findOne(parameterOne.getName());
        assertEquals(one.getName(), parameterOne.getName());

        ParameterModel parameterTwo = new ParameterModel(new InputModel("glob is V"));
        service.save(parameterTwo);
        ParameterModel two = service.findOne(parameterOne.getName());
        assertEquals(two.getName(), parameterTwo.getName());
    }

    @Test
    public void addManyParameterTest() {

        service.save(parameterOne);
        ParameterModel parameterTwo = new ParameterModel(new InputModel("prok is V"));
        service.save(parameterTwo);
        ParameterModel parameterThree = new ParameterModel(new InputModel("pish is X"));
        service.save(parameterThree);
        ParameterModel parameterFour = new ParameterModel(new InputModel("tegj is L"));
        service.save(parameterFour);

        assertEquals(service.exists("prok"), Boolean.TRUE);
        assertEquals(service.exists("asdsa"), Boolean.FALSE);
        assertEquals(service.exists("glob"), Boolean.TRUE);
        assertEquals(service.exists("pish"), Boolean.TRUE);
        assertEquals(service.exists("home"), Boolean.FALSE);
        assertEquals(service.exists("tegj"), Boolean.TRUE);
        assertEquals(service.exists("prok"), Boolean.TRUE);
        assertEquals(service.exists("as23dsa"), Boolean.FALSE);
    }
}
