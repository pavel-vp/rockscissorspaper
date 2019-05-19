package com.acme.rsp.model;

public enum Result {
    WIN("Win"), LOSE("Lose"), DRAW("Draw");

    private String desc;
    Result(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }
}
