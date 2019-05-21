package com.acme.rsp.service;

import com.acme.rsp.model.Item;

/**
 * Helper class to translate string constants to Items
 */
public class ItemFabric {

    /**
     * Method translates String constants to Items
     * @param value - String representation of Item (1-rock,2-scissors,3-paper)
     * @return - Item (null, if the input is wrong)
     */
    public static Item getItemByConstant(String value) {
        switch (value) {
            case "1": return Item.ROCK;
            case "2": return Item.SCISSORS;
            case "3": return Item.PAPER;
        }
        return null;
    }
}
