package com.acme.rsp.service;

import com.acme.rsp.model.Item;

/**
 * Interface describes functionality of making a computer's move.
 */
public interface Mover {
    /**
     * Base on the Statistic object, make a move and return an Item.
     * @param statistic - helper that stores statistic about previous moves.
     * @return computer's Item.
     */
    Item makeMove(Statistic statistic);
}
