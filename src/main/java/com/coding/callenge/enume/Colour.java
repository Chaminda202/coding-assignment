package com.coding.callenge.enume;

public enum Colour {
    GREY("grey"),
    ORANGE("orange");

    private String value;

    Colour(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
