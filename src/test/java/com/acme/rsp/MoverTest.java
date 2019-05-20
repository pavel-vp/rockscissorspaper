package com.acme.rsp;

import com.acme.rsp.service.Mover;
import org.junit.Before;
import org.junit.Test;

public class MoverTest {

    private Mover simpleMover;

    @Before
    public void setUp() {
    }

    @Test
    public void mover_simple_test() {
        System.out.println(simpleMover.makeMove(null));
    }

}
