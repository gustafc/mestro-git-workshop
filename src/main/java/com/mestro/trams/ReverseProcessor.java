package com.mestro.trams;

public class ReverseProcessor implements Processor {
    @Override
    public String process(String source) {
        // TODO: Use StringBuilder.reverse instead
        String output = "";
        for (char ch : source.toCharArray()) output = ch + output;
        return output;
    }
}
