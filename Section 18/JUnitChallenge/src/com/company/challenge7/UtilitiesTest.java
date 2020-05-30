package com.company.challenge7;

import org.junit.Test;

import com.company.Utilities;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @Test
    public void everyNthChar() {
    }

    @Test
    public void removePairs() {
    }

    @Test
    public void converter() {

        Utilities utilities = new Utilities();
        assertEquals(300, utilities.converter(10, 5));
    }

    @Test
    public void nullIfOddLength() {
    }
}