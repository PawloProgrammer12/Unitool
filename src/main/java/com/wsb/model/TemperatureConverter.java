package com.wsb.model;

import javax.validation.constraints.NotNull;

public class TemperatureConverter {

    @NotNull(message = "{temperature.celsius.notNull}")
    private String celsius;

    private String fahrenheit;

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }

    public String getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}
