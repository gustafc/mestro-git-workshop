package com.mestro.trams;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseProcessorTest {

    final ReverseProcessor instance = new ReverseProcessor();

    @Test
    public void shouldProcessEmptyCorrectly(){
        assertEquals("", instance.process(""));
    }

    @Test
    public void shouldProcessCorrectly(){
        assertEquals("banan", instance.process("nanab"));
    }

}