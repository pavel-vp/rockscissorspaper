package com.acme.rsp.model;

public interface ItemFunction {
    Result compareToOther(Item other);
    String getDesc();
}
