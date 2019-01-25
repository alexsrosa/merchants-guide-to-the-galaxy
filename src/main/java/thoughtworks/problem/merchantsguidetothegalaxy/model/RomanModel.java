package thoughtworks.problem.merchantsguidetothegalaxy.model;

import thoughtworks.problem.merchantsguidetothegalaxy.model.enums.RomanNumeralsEnum;

import java.util.HashMap;
import java.util.Map;

public class RomanModel {

    private Map<String, Integer> romansMax = new HashMap<>();
    private Integer lastValue = 0;
    private Integer result = 0;
    private Integer consecutiveRoman = 0;
    private RomanNumeralsEnum beforeRoman = null;
    private ParameterModel parameter;
    private Integer currentValue;

    public Map<String, Integer> getRomansMax() {
        return romansMax;
    }

    public void setRomansMax(Map<String, Integer> romansMax) {
        this.romansMax = romansMax;
    }

    public Integer getLastValue() {
        return lastValue;
    }

    public void setLastValue(Integer lastValue) {
        this.lastValue = lastValue;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getConsecutiveRoman() {
        return consecutiveRoman;
    }

    public void setConsecutiveRoman(Integer consecutiveRoman) {
        this.consecutiveRoman = consecutiveRoman;
    }

    public RomanNumeralsEnum getBeforeRoman() {
        return beforeRoman;
    }

    public void setBeforeRoman(RomanNumeralsEnum beforeRoman) {
        this.beforeRoman = beforeRoman;
    }

    public ParameterModel getParameter() {
        return parameter;
    }

    public void setParameter(ParameterModel parameter) {
        this.parameter = parameter;
    }

    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }
}
