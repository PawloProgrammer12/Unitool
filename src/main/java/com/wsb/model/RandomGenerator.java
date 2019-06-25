package com.wsb.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class RandomGenerator {
    private String randomNumber;

    @NotNull(message = "{rangeFrom.min.notNull}")
    @Min(value = -2147483648, message = "{rangeFrom.min.value}")
    @Max(value = 2147483647, message = "{rangeFrom.max.value}")
    private String rangeFrom;

    @NotNull(message = "{rangeFrom.min.notNull}")
    @Min(value = -2147483648, message = "{rangeTo.min.value}")
    @Max(value = 2147483647, message = "{rangeTo.max.value}")
    private String rangeTo;

    public RandomGenerator(){

    }

    public RandomGenerator(String rangeFrom, String rangeTo){
        this.rangeFrom = rangeFrom;
        this.rangeTo = rangeTo;
    }

    public String getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String getRangeFrom() {
        return rangeFrom;
    }

    public void setRangeFrom(String rangeFrom) {
        this.rangeFrom = rangeFrom;
    }

    public String getRangeTo() {
        return rangeTo;
    }

    public void setRangeTo(String rangeTo) {
        this.rangeTo = rangeTo;
    }
}
