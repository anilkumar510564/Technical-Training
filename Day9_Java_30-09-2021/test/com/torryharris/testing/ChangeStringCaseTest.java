package com.torryharris.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChangeStringCaseTest {

    ChangeStringCase stringCase;
    @Before
    public void setUp() throws Exception {
        System.out.println("Before Test Case");
        stringCase=new ChangeStringCase();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After Test Case");
    }

    @Test
    public void toCapitalLetter() {
        Assert.assertEquals("research and analysis wing",stringCase.toCapitalLetter("research and analysis wing"));

    }

    @Test
    public void toSmallLetter() {
        Assert.assertEquals("intelligence bureau",stringCase.toSmallLetter("INTELLIGENCE BUREAU"));
    }
}