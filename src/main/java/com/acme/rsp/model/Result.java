package com.acme.rsp.model;

/**
 * Class representing result of the human's move.
 * It can be WIN, LOSE, DRAW.
 */
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
