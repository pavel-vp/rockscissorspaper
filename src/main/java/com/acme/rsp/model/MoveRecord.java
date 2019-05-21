package com.acme.rsp.model;

/**
 * Class that stores the whole result of the game's move. It contains human's item and computer's item and the result.
 */
public class MoveRecord {
    private Item itemHuman;
    private Item itemComputer;
    private Result result;

    /**
     * Constructor to store all data
     * @param itemHuman - human's item
     * @param itemComputer - computer's item
     * @param result - result of the movement
     */
    public MoveRecord(Item itemHuman, Item itemComputer, Result result) {
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
