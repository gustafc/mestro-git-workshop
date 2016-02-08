package com.mestro.trams;

public class UpperCaseProcessor implements Processor {
    @Override
    public String process(String source) {
        return source.toUpperCase();
    }
}
