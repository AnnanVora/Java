package com.annan.section18.challenge6;

import com.annan.section18.Utilities;
import org.junit.Test;

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
    }

    @Test
    public void nullIfOddLength() {
        Utilities utilities = new Utilities();
        assertNull(utilities.nullIfOddLength("Pie"));
        assertNotNull(utilities.nullIfOddLength("Cake"));
    }
}