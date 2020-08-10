package com.annan.section18.challenge9;

import com.annan.section18.Utilities;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private static Utilities utils = new Utilities();

    @Before
    public void setup() {
        utils = new Utilities();
    }

    @Test
    public void everyNthChar() {

        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] output = new char[]{'e', 'l'};
        assertArrayEquals(output, utils.everyNthChar(input, 2));
        char[] input2 = new char[]{'h', 'e', 'l', 'l', 'o'};
        Utilities utilities = new Utilities();
        assertArrayEquals(input2, utilities.everyNthChar(input, 6));
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", utils.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utils.removePairs("ABCCABDEEF"));
        assertNull(utils.removePairs(null));
        assertEquals("A", utils.removePairs("A"));
    }

    @Test(expected = ArithmeticException.class)
    public void converter() {

        assertEquals(300, utils.converter(10, 5));
        utils.converter(10, 0);
    }

    @Test
    public void nullIfOddLength() {

        assertNull(utils.nullIfOddLength("Pie"));
        assertNotNull(utils.nullIfOddLength("Cake"));
    }
}