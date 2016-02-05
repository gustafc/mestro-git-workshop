package com.mestro.trams;

import org.junit.Test;

import static org.junit.Assert.*;

public class LowerCaseProcessorTest {

    final LowerCaseProcessor instance = new LowerCaseProcessor();

    @Test
    public void shouldProcessEmptyCorrectly(){
        assertEquals("", instance.process(""));
    }

    @Test
    public void shouldProcessCorrectly(){
        assertEquals("apelsin", instance.process("APELSin"));
    }

}