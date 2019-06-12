package com.wsb.model;

public class Data {
    private Integer randomNumber;
    private Integer rangeFrom;
    private Integer rangeTo;

    public Data(){

    }

    public Data(Integer rangeFrom, Integer rangeTo){
        this.rangeFrom = rangeFrom;
        this.rangeTo = rangeTo;
    }

    public Integer getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(Integer randomNumber) {
        this.randomNumber = randomNumber;
    }

    public Integer getRangeFrom() {
        return rangeFrom;
    }

    public void setRangeFrom(Integer rangeFrom) {
        this.rangeFrom = rangeFrom;
    }

    public Integer getRangeTo() {
        return rangeTo;
    }

    public void setRangeTo(Integer rangeTo) {
        this.rangeTo = rangeTo;
    }
}
