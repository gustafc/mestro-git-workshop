package com.mestro.trams;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrimmingProcessorTest {

    final TrimmingProcessor instance = new TrimmingProcessor();

    @Test
    public void shouldProcessEmptyCorrectly(){
        assertEquals("", instance.process(""));
    }

    @Test
    public void shouldProcessCorrectly(){
        assertEquals("apelsin", instance.process(" apelsin    "));
    }

}