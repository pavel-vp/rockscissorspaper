package com.acme.rsp.model;

/**
 * Interface, describes functionality of the game's Item.
 */
public interface ItemFunction {
    /**
     * Method compares this Item to the Other
     * @param other - an Item to compare with
     * @return - Result - result of the comparison.
     */
    Result compareToOther(Item other);

    /**
     * Return String representation of the Item
     * @return - String description
     */
    String getDesc();
}
