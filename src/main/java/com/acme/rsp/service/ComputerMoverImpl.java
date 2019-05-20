package com.acme.rsp.service;

import com.acme.rsp.model.Item;
import com.acme.rsp.model.Result;

public class ComputerMoverImpl implements Mover {

    @Override
    public Item makeMove(Statistic statistic) {
        Statistic.StatElement statElement = statistic.getStatData().peek();

        if (statElement != null && statElement.getResult() != Result.DRAW) {
            if (statElement.getResult() == Result.LOSE) {
                switch (statElement.getItemComputer()) {
                    case ROCK:
                        return Item.SCISSORS;
                    case SCISSORS:
                        return Item.PAPER;
                    case PAPER:
                        return Item.ROCK;
                }
            } else {
                switch (statElement.getItemComputer()) {
                    case ROCK:
                        return Item.PAPER;
                    case SCISSORS:
                        return Item.ROCK;
                    case PAPER:
                        return Item.SCISSORS;
                }
            }
        }
        return ItemFabric.getItemByConstant(String.valueOf((int)(Math.random() * 3 + 1)));
    }

}
