package com.annan.section18.challenge8;

import com.annan.section18.Utilities;
import org.junit.Test;

public class UtilitiesTest {

    @Test
    public void everyNthChar() {
    }

    @Test
    public void removePairs() {
    }

    @Test(expected = ArithmeticException.class)
    public void converter() {

        Utilities utilities = new Utilities();
        utilities.converter(10, 0);
    }

    @Test
    public void nullIfOddLength() {
    }
}