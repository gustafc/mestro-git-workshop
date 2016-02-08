package com.mestro.trams;

public class LengthProcessor implements Processor {
    @Override
    public String process(String source) {
        return String.valueOf(source.length());
    }
}
