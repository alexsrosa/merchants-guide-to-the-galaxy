package thoughtworks.problem.merchantsguidetothegalaxy.processor;

import org.junit.Test;
import thoughtworks.problem.merchantsguidetothegalaxy.business.processors.InputProcessor;

public class ProcessorTest {

    @Test
    public void processorWithParamTest() {
        new InputProcessor().run("glob is I");
    }

    @Test
    public void processorWithParam2Test() {
        new InputProcessor().run("glob prok Gold is 57800 Credits");
    }
}
