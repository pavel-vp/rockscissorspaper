package com.acme.rsp.game.rsp;

import com.acme.rsp.model.Item;

public class RSPMove implements GameMove<Item> {

    private final Item item;

    public RSPMove(Item item) {
        this.item = item;
    }

    public Item getData() {
        return item;
    }
}
