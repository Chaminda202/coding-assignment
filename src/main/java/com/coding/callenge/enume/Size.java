package com.coding.callenge.enume;

public enum Size {
    LARGE("large"),
    SMALL("small");

    private String value;

    Size(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
