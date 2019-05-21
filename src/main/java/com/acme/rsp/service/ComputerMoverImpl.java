package com.acme.rsp.service;

import com.acme.rsp.model.Item;
import com.acme.rsp.model.MoveRecord;
import com.acme.rsp.model.Result;

/**
 * Implementation of the Mover interface to make a computer move.
 * This class realizes simple logic to do a next move, based on wich was the previous choice.
 * If it is the first time - it makes it random.
 */
public class ComputerMoverImpl implements Mover {

    @Override
    public Item makeMove(Statistic statistic) {
        MoveRecord moveRecord = statistic.getStatData().peek();

        if (moveRecord != null && moveRecord.getResult() != Result.DRAW) {
            if (moveRecord.getResult() == Result.LOSE) {
                switch (moveRecord.getItemComputer()) {
                    case ROCK:
                        return Item.SCISSORS;
                    case SCISSORS:
                        return Item.PAPER;
                    case PAPER:
                        return Item.ROCK;
                }
            } else {
                switch (moveRecord.getItemComputer()) {
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
