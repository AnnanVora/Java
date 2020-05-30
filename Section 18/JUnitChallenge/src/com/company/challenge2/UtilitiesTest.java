package com.company.challenge2;

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
        assertEquals("ABCDEF", utils.removePairs("AABCDDEFF"));
    }

    @Test
    public void removePairs2() {
        assertEquals("ABCABDEF", utils.removePairs("ABCCABDEEF"));
    }

    @Test
    public void converter() {
    }

    @Test
    public void nullIfOddLength() {
    }
}