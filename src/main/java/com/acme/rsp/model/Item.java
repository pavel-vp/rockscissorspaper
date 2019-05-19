package com.acme.rsp.model;

public interface Item {

    Result compareToOther(Item other);
    String getDescr();
    ItemType getItemType();


}
