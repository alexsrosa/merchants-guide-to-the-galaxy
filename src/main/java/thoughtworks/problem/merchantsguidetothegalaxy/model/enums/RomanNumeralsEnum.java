package thoughtworks.problem.merchantsguidetothegalaxy.model.enums;

import thoughtworks.problem.merchantsguidetothegalaxy.exception.GeneralExceptionUtils;
import thoughtworks.problem.merchantsguidetothegalaxy.helpers.StringUtils;

import java.util.stream.Stream;

/**
 * Enumeration of types of Roman numbers and their peculiarities.
 *
 * @author <a href="mailto:alexsros@gmail.com.br">alexsros</a>
 * @since 08/10/2018 12:09:00
 */
public enum RomanNumeralsEnum {

    I(1, "I", 3, 4, StringUtils.ONE_SPACE),
    V(5, "V", 0, 1, "I"),
    X(10, "X", 3, 4, "I"),
    L(50, "L", 0, 1, "X"),
    C(100, "C", 3, 4, "X"),
    D(500, "D", 0, 1, "C"),
    M(1000, "M", 3, 4, "C");

    private Integer value;
    private String name;
    private Integer consecutiveRepetitions;
    private Integer maximum;
    private String subtractedBy;

    RomanNumeralsEnum(Integer value, String name, Integer consecutiveRepetitions,
            Integer maximum, String subtractedBy) {
        this.value = value;
        this.name = name;
        this.consecutiveRepetitions = consecutiveRepetitions;
        this.maximum = maximum;
        this.subtractedBy = subtractedBy;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public Integer getConsecutiveRepetitions() {
        return consecutiveRepetitions;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public String getSubtractedBy() {
        return subtractedBy;
    }

    /**
     * Converts integer to {@link RomanNumeralsEnum} based on your code.
     * If an integer passed that does not exist in the enum, {@link RuntimeException} is triggered.
     *
     * @param name Enum Value
     * @return {@link RomanNumeralsEnum}
     */
    public static RomanNumeralsEnum getEnumByName(String name) {
        return Stream.of(values())
                .filter(e -> e.name.equals(name)).findFirst()
                .orElseThrow(() ->
                        new RuntimeException(GeneralExceptionUtils.I_HAVE_NO_IDEA_WHAT_YOU_ARE_TALKING_ABOUT));
    }
}
