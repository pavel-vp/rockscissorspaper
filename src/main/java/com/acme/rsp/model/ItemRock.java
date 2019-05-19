package com.acme.rsp.model;

import static com.acme.rsp.model.ItemType.*;

public class ItemRock implements Item {

    public Result compareToOther(Item other) {
        switch (other.getItemType()) {
            case PAPER:
                return Result.LOSE;
            case ROCK:
                return Result.DRAW;
            case SCISSORS:
                return Result.WIN;
        }
        return Result.DRAW;
    }

    public String getDescr() {
        return ROCK.getName();
    }

    public ItemType getItemType() {
        return ROCK;
    }
}
