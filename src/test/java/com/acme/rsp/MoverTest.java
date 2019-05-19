package com.acme.rsp;

import com.acme.rsp.service.Mover;
import com.acme.rsp.service.SimpleMoverImpl;
import org.junit.Before;
import org.junit.Test;

public class MoverTest {

    private Mover simpleMover;

    @Before
    public void setUp() {
        simpleMover = new SimpleMoverImpl();
    }

    @Test
    public void mover_simple_test() {
        System.out.println(simpleMover.makeMove());
    }

}
