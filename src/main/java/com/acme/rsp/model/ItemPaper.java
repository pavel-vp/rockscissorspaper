package com.acme.rsp.model;

import static com.acme.rsp.model.ItemType.*;

public class ItemPaper implements Item {
    public Result compareToOther(Item other) {
        switch (other.getItemType()) {
            case PAPER:
                return Result.DRAW;
            case ROCK:
                return Result.WIN;
            case SCISSORS:
                return Result.LOSE;
        }
        return Result.DRAW;
    }

    public String getDescr() {
        return PAPER.getName();
    }

    public ItemType getItemType() {
        return PAPER;
    }

}
