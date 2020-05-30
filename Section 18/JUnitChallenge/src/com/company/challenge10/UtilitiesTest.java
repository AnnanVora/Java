package com.company.challenge10;

import com.company.Utilities;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UtilitiesTest {

    private Utilities utils;
    private String input;
    private String output;

    public UtilitiesTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setup() {
        utils = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object [][] {
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }

    @Test
    public void removePairs() throws Exception {
        assertEquals(output, utils.removePairs(input));
    }
}
