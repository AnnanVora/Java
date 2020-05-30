package com.company.challenge8;

import com.company.Utilities;
import org.junit.Test;

import static org.junit.Assert.*;

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