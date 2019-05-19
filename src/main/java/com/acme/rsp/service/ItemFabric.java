package com.acme.rsp.service;

import com.acme.rsp.model.Item;

public class ItemFabric {

    public static Item getItemByConstant(String value) {
        switch (value) {
            case "1": return Item.ROCK;
            case "2": return Item.SCISSORS;
            case "3": return Item.PAPER;
        }
        return null;
    }
}
