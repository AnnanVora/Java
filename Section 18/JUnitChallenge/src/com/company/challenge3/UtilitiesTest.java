package com.company.challenge3;

import com.company.Utilities;
import org.junit.Test;

import static org.junit.Assert.*;

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