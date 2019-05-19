package com.acme.rsp;

import com.acme.rsp.model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseItemTest {

    private Item rock;
    private Item scissors;
    private Item paper;

    @Before
    public void setUp() {
        this.rock = new ItemRock();
        this.scissors = new ItemScissors();
        this.paper = new ItemPaper();
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

}
