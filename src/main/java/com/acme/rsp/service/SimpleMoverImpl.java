package com.acme.rsp.service;

import com.acme.rsp.model.*;

public class SimpleMoverImpl implements Mover {
    public Item makeMove() {
        int rnd = (int) (Math.random() * 3);
        switch (rnd) {
            case 0: return new ItemRock();
            case 1: return new ItemScissors();
            case 2: return new ItemPaper();
        }
        return null;
    }
}
