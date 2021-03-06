package com.acme.rsp;

import com.acme.rsp.model.Item;
import com.acme.rsp.model.MoveRecord;
import com.acme.rsp.model.Result;
import com.acme.rsp.service.Statistic;
import org.junit.Before;
import org.junit.Test;

import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class StatisticTest {
    private Statistic statistic;

    @Before
    public void setUp() {
        statistic = new Statistic();
    }

    @Test
    public void add_stat_elems_test() {
        MoveRecord moveRecord =  statistic.checkAndSaveStat(Item.ROCK, Item.PAPER);
        assertEquals(moveRecord.getResult(), Result.LOSE);
        moveRecord =  statistic.checkAndSaveStat(Item.PAPER, Item.PAPER);
        assertEquals(moveRecord.getResult(), Result.DRAW);
        moveRecord =  statistic.checkAndSaveStat(Item.SCISSORS, Item.PAPER);
        assertEquals(moveRecord.getResult(), Result.WIN);

        Queue<MoveRecord> queue = statistic.getStatData();
        assertEquals(queue.size(), 3);
        assertEquals(queue.peek().getItemHuman(), Item.ROCK);
    }

}
