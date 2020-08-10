package com.annan.section18.challenge4;

import com.annan.section18.Utilities;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class UtilitiesTest {

    Utilities utils = new Utilities();

    @Test
    public void everyNthChar() {

        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] output = new char[]{'e', 'l'};
        assertArrayEquals(output, utils.everyNthChar(input, 2));
    }

    @Test
    public void removePairs() {
    }

    @Test
    public void converter() {
    }

    @Test
    public void nullIfOddLength() {
    }
}