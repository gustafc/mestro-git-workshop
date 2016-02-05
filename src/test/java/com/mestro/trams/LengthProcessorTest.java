package com.mestro.trams;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthProcessorTest {

    final LengthProcessor instance = new LengthProcessor();

    @Test
    public void shouldReturnCorrectLengthForEmpty(){
        assertEquals("0", instance.process(""));
    }

    @Test
    public void shouldReturnCorrectLength(){
        assertEquals("6", instance.process("citron"));
    }

}