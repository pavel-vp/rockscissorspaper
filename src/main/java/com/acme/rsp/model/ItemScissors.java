package com.acme.rsp.model;

import static com.acme.rsp.model.ItemType.*;

public class ItemScissors implements Item {
    public Result compareToOther(Item other) {
        switch (other.getItemType()) {
            case PAPER:
                return Result.WIN;
            case ROCK:
                return Result.LOSE;
            case SCISSORS:
                return Result.DRAW;
        }
        return Result.DRAW;
    }

    public String getDescr() {
        return SCISSORS.getName();
    }

    public ItemType getItemType() {
        return SCISSORS;
    }
}
