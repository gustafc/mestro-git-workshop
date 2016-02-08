package com.mestro.trams;

public class TrimmingProcessor implements Processor {
    @Override
    public String process(String source) {

        return source.trim();
    }
}
