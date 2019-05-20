package com.acme.rsp.service;

import com.acme.rsp.model.Item;
import com.acme.rsp.model.Result;

import java.util.LinkedList;
import java.util.Queue;

public class Statistic {

    private static final int LIMIT = 20;

    public static class StatElement {
        private Item itemHuman;
        private Item itemComputer;
        private Result result;

        public StatElement(Item itemHuman, Item itemComputer, Result result) {
            this.itemHuman = itemHuman;
            this.itemComputer = itemComputer;
            this.result = result;
        }

        public Item getItemHuman() {
            return itemHuman;
        }

        public Item getItemComputer() {
            return itemComputer;
        }

        public Result getResult() {
            return result;
        }
    }

    private Queue<StatElement> statData = new LinkedList<>();

    public int getWinsHuman() {
        return winsHuman;
    }

    public int getWinsComputer() {
        return winsComputer;
    }

    private int winsHuman = 0;
    private int winsComputer = 0;

    public Result checkAndSaveStat(Item itemHuman, Item itemComputer) {
        Result result = itemHuman.compareToOther(itemComputer);
        switch (result) {
            case WIN:
                winsHuman++;
                break;
            case LOSE:
                winsComputer++;
                break;

        }
        statData.add(new StatElement(itemHuman, itemComputer, result));
        while (statData.size() > LIMIT) {
            statData.remove();
        }
        return result;
    }

    public Queue<StatElement> getStatData() {
        return statData;
    }

}
