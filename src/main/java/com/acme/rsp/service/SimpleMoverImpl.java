package com.acme.rsp.service;

import com.acme.rsp.model.*;

public class SimpleMoverImpl implements Mover {

    public Item makeMove(Statistic statistic) {
        int rnd = (int) (Math.random() * 3);
        switch (rnd) {
            case 0: return Item.ROCK;
            case 1: return Item.SCISSORS;
            case 2: return Item.PAPER;
        }
        return null;
    }
}
