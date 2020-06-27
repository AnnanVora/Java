package com.annan.section18.challenge5;

import com.annan.section18.Utilities;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @Test
    public void everyNthChar() {
        char[] input = new char[] {'h', 'e', 'l', 'l', 'o'};
        Utilities utilities = new Utilities();
        assertArrayEquals(input, utilities.everyNthChar(input, 6));
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