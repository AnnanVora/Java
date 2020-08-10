package com.annan.section18.challenge3;

import com.annan.section18.Utilities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class UtilitiesTest {

    Utilities utils = new Utilities();

    @Test
    public void everyNthChar() {
    }

    @Test
    public void removePairs() {

        assertNull(utils.removePairs(null));
        assertEquals("A", utils.removePairs("A"));
    }

    @Test
    public void converter() {
    }

    @Test
    public void nullIfOddLength() {
    }
}