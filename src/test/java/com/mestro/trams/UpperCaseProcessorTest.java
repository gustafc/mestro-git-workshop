package com.mestro.trams;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseProcessorTest {

    final UpperCaseProcessor instance = new UpperCaseProcessor();

    @Test
    public void shouldProcessEmptyCorrectly(){
        assertEquals("", instance.process(""));
    }

    @Test
    public void shouldProcessCorrectly(){
        assertEquals("APELSIN", instance.process("aPeLsIn"));
    }

}