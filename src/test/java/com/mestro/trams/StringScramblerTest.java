package com.mestro.trams;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by Sesdun on 2016-02-08.
 */
public class StringScramblerTest {

    static StringScrambler instance = new StringScrambler();

    @Test
    public void testScramble() { assertNotEquals("alphabet", instance.scrabmle("alphabet")); }
}
