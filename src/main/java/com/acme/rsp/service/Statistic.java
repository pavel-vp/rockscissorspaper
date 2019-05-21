package com.acme.rsp.service;

import com.acme.rsp.model.Item;
import com.acme.rsp.model.MoveRecord;
import com.acme.rsp.model.Result;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Helper class, that stores statistics of moves and results in Queue with max size (20 by default). Queue realized by LinkedList with FIFE strategy.
 */
public class Statistic {

    private static final int LIMIT = 20;

    private Queue<MoveRecord> statData = new LinkedList<>();

    public int getWinsHuman() {
        return winsHuman;
    }

    public int getWinsComputer() {
        return winsComputer;
    }

    private int winsHuman = 0;
    private int winsComputer = 0;

    /**
     * Get human's item and computer's item, compares it, increment total scores and saves the statistics in internal queue.
     * @param itemHuman - human's item
     * @param itemComputer - computer's item
     * @return MoveRecord of the move with result.
     */
    public MoveRecord checkAndSaveStat(Item itemHuman, Item itemComputer) {
        Result result = itemHuman.compareToOther(itemComputer);
        switch (result) {
            case WIN:
                winsHuman++;
                break;
            case LOSE:
                winsComputer++;
                break;

        }
        MoveRecord element = new MoveRecord(itemHuman, itemComputer, result);
        statData.add(element);
        while (statData.size() > LIMIT) {
            statData.remove();
        }
        return element;
    }

    public Queue<MoveRecord> getStatData() {
        return statData;
    }

}
