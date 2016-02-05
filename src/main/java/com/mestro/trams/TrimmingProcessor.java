package com.mestro.trams;

public class TrimmingProcessor implements Processor {
    @Override
    public String process(String source) {
        // TODO: Make this less cryptic with source.trim instead
        return source.replaceAll("^\\s*|\\s*$", "");
    }
}
