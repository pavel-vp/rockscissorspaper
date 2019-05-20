package com.acme.rsp;

import com.acme.rsp.model.*;
import com.acme.rsp.service.ItemFabric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseItemTest {

    private Item rock;
    private Item scissors;
    private Item paper;

    @Before
    public void setUp() {
        this.rock = Item.ROCK;
        this.scissors = Item.SCISSORS;
        this.paper = Item.PAPER;
    }

    @Test
    public void items_rock_test() {
        assertEquals(rock.compareToOther(rock), Result.DRAW);
        assertEquals(rock.compareToOther(scissors), Result.WIN);
        assertEquals(rock.compareToOther(paper), Result.LOSE);
    }
    @Test
    public void items_scissors_test() {
        assertEquals(scissors.compareToOther(rock), Result.LOSE);
        assertEquals(scissors.compareToOther(scissors), Result.DRAW);
        assertEquals(scissors.compareToOther(paper), Result.WIN);
    }
    @Test
    public void items_paper_test() {
        assertEquals(paper.compareToOther(rock), Result.WIN);
        assertEquals(paper.compareToOther(scissors), Result.LOSE);
        assertEquals(paper.compareToOther(paper), Result.DRAW);
    }

    @Test
    public void item_byconst_test() {
        Item item1 = ItemFabric.getItemByConstant("1");
        Item item2 = ItemFabric.getItemByConstant("2");
        Item item3 = ItemFabric.getItemByConstant("3");

        assertEquals(item1, Item.ROCK);
        assertEquals(item2, Item.SCISSORS);
        assertEquals(item3, Item.PAPER);
    }

}
