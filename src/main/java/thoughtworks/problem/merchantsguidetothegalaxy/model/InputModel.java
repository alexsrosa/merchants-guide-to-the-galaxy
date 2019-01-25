package thoughtworks.problem.merchantsguidetothegalaxy.model;


import thoughtworks.problem.merchantsguidetothegalaxy.business.strategies.CreditStrategy;
import thoughtworks.problem.merchantsguidetothegalaxy.business.strategies.StrategyInterface;
import thoughtworks.problem.merchantsguidetothegalaxy.business.strategies.ParameterStrategy;
import thoughtworks.problem.merchantsguidetothegalaxy.business.strategies.QuestionHowManyCreditsStrategy;
import thoughtworks.problem.merchantsguidetothegalaxy.business.strategies.QuestionHowMuchStrategy;
import thoughtworks.problem.merchantsguidetothegalaxy.exception.GeneralExceptionUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.CreditUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.ParameterUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.QuestionUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.StringUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.model.enums.InputTypeEnum;

import java.util.Objects;

/**
 * Model class of the input data.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public class InputModel {

    private final String inputPhrase;
    private final InputTypeEnum inputType;
    private final StrategyInterface strategy;

    public InputModel(String inputPhrase) {
        this.inputPhrase = inputPhrase;
        this.inputType = defineInputType();
        this.strategy = defineStrategy();
    }

    public String getInputPhrase() {
        return inputPhrase;
    }

    public InputTypeEnum getInputType() {
        return inputType;
    }

    /**
     * Method that executes selected strategy.
     *
     * @return Returns generated string
     */
    public String executeStrategy() {
        return strategy.run(this);
    }

    /**
     * Este método valida se a entrada é uma questão.
     *
     * @return retorna um boolean
     */
    public boolean isQuestion() {
        return QuestionUtils.isQuestion(getValues()[0]);
    }

    /**
     * Method that returns the received values.
     *
     * @return returns a list of strings
     */
    public String[] getValues() {
        StringUtils.validateString(inputPhrase);
        return inputPhrase.split(StringUtils.ONE_SPACE);
    }

    /**
     * A method that effectively defines the type of input.
     *
     * @return finding the type returns an object {@link InputTypeEnum}
     */
    private InputTypeEnum defineInputType() {
        String[] values = getValues();
        InputTypeEnum inputTypeEnum;

        if (isQuestion()) {
            inputTypeEnum = QuestionUtils.defineInputTypeQuestion(values);

            if (Objects.isNull(inputTypeEnum)) {
                GeneralExceptionUtils.error();
            }

            return inputTypeEnum;
        }

        if (CreditUtils.isCredits(values, inputPhrase)) {
            return InputTypeEnum.CREDITS;
        }

        if (ParameterUtils.isParameter(values)) {
            return InputTypeEnum.PARAM;
        }

        GeneralExceptionUtils.error();
        return null;
    }

    /**
     * Method that defines the strategy that will be used for this entry.
     *
     * @return returns an object of type {@link StrategyInterface}
     */
    private StrategyInterface defineStrategy() {
        switch (inputType) {
            case PARAM:
                return new ParameterStrategy();
            case CREDITS:
                return new CreditStrategy();
            case HOW_MANY_CREDITS_IS:
                return new QuestionHowManyCreditsStrategy();
            case HOW_MUCH_IS:
                return new QuestionHowMuchStrategy();
            default:
                GeneralExceptionUtils.error();
                return null;
        }
    }
}
