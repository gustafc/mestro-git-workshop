package com.mestro.trams;

public class LowerCaseProcessor implements Processor {
    @Override
    public String process(String source) {
        // TODO: Use source.toLowerCase instead
        String output = "";
        for (char ch: source.toCharArray()) output += Character.toLowerCase(ch);
        return output;
    }
}
