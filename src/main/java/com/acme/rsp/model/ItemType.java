package com.acme.rsp.model;

public enum ItemType {
    ROCK("Rock"), SCISSORS("Scissors"), PAPER("Scissors");

    private String name;
    ItemType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
