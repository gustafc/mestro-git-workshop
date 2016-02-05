package com.mestro.trams;

public class LengthProcessor implements Processor {
    @Override
    public String process(String source) {
        // TODO: Use source.length instead
        int len = 0;
        for (char ch: source.toCharArray()) ++len;
        return len + "";
    }
}
