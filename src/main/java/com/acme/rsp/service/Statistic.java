package com.acme.rsp.service;

import com.acme.rsp.model.Item;
import com.acme.rsp.model.Result;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Statistic {

    private static final int LIMIT = 20;

    private Queue<Item> statData = new LinkedList<>();

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
        statData.add(itemHuman);
        while (statData.size() > LIMIT) {
            statData.remove();
        }
        return result;
    }

    public Map<Item, Integer> buildMapStat() {
        Map<Item, Integer> map = new HashMap<>();
        for (Item item: statData) {
            Integer count = map.get(item);
            if (count == null) {
                count = 0;
            }
            map.put(item, count + 1);
        }
        return map;
    }

}
