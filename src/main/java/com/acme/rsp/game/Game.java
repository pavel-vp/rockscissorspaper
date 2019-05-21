package com.acme.rsp.game;

import com.acme.rsp.model.Item;
import com.acme.rsp.model.MoveRecord;
import com.acme.rsp.service.Mover;
import com.acme.rsp.service.Statistic;

/**
 * Core abstract class, encapsulating main logic of the game process.
 * Two fields must be initiated -
 * Mover mover - decision maker about how computer will move.
 * Statistic statistic - helper object which stores statistic data.
 */
public abstract class Game {
    protected Mover mover;
    protected Statistic statistic;

    /**
     * Taking Human's move data, calls the makeMove method from Mover object, and saving a result to the Statistic object.
     * @param itemHuman - Human's chosen item.
     * @return MoveRecord, contains Human's and Computer's items and the Result.
     */
    protected MoveRecord move(Item itemHuman) {
        Item itemComputer = mover.makeMove(statistic);
        return statistic.checkAndSaveStat(itemHuman, itemComputer);
    }

    /**
     * Optional method, that can be override to realize an interaction game logic.
     */
    public abstract void play();
}
