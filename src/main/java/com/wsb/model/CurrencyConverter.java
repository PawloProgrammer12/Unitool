package com.wsb.model;

import javax.validation.constraints.NotNull;

public class CurrencyConverter {

    @NotNull(message = "{currency.euro.notNull}")
    private String euro;

    private String dollar;

    public String getEuro() {
        return euro;
    }

    public void setEuro(String euro) {
        this.euro = euro;
    }

    public String getDollar() {
        return dollar;
    }

    public void setDollar(String dollar) {
        this.dollar = dollar;
    }
}
