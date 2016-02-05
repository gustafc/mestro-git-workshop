package com.mestro.trams;

public class UpperCaseProcessor implements Processor {
    @Override
    public String process(String source) {
        // TODO: Use source.toUpperCase instead
        String output = "";
        for (char ch: source.toCharArray()) output += Character.toUpperCase(ch);
        return output;
    }
}
