package thoughtworks.problem.merchantsguidetothegalaxy;

import thoughtworks.problem.merchantsguidetothegalaxy.business.processors.InputProcessor;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.MessageUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.StringUtils;

import java.util.Scanner;

/**
 * Main class for running the application.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class RunApplication {

    /**
     * Main method for running the application where it executes {@link InputProcessor}
     *
     * @param args argumentos de entrada
     */
    public static void main(String[] args) {

        MessageUtils.welcome();

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {

            String value = scan.nextLine();

            if (MessageUtils.EXIT.equals(value.toLowerCase())) {
                scan.close();
                MessageUtils.close();
                break;
            }

            execute(value);
        }
    }

    /**
     * Method that performs the processing.
     *
     * @param value string to be processed
     */
    private static void execute(String value) {
        if (!StringUtils.EMPTY.equals(value)) {
            InputProcessor.run(value);
        }
    }
}
