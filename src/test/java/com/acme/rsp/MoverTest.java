package com.acme.rsp;

import com.acme.rsp.model.Item;
import com.acme.rsp.service.ComputerMoverImpl;
import com.acme.rsp.service.Mover;
import com.acme.rsp.service.Statistic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MoverTest {

    private Mover mover;

    @Before
    public void setUp() {
        mover = new ComputerMoverImpl();
    }

    @Test
    public void mover_simple_test() {
        Item item = mover.makeMove(new Statistic());
        assertNotNull(item);
    }

}
