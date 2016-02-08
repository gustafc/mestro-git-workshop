package com.mestro.trams;

public class LowerCaseProcessor implements Processor {
    @Override
    public String process(String source) {
        return source.toLowerCase();
    }
}
