package com.torryharris.testing;

import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void add() {
        //Calculator cal=new Calculator();
        assertEquals(11,10-1);
    }

    @org.junit.Test
    public void sub() {
        assertEquals(9,10-1);
    }

    @org.junit.Test
    public void mul() {
        assertEquals(12,6*2);
    }

    @org.junit.Test
    public void div() {
        assertEquals(2,10/5);
    }
}