package com.acme.rsp.service;

import com.acme.rsp.model.Item;
import com.acme.rsp.model.ItemPaper;
import com.acme.rsp.model.ItemRock;
import com.acme.rsp.model.ItemScissors;

public class ItemFabric {

    public static Item getItemByConstant(String value) {
        switch (value) {
            case "1": return new ItemRock();
            case "2": return new ItemScissors();
            case "3": return new ItemPaper();
        }
        return null;
    }
}
