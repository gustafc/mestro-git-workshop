package com.mestro.trams;

public interface Processor {

    String process(String source);

    static Processor forName(String name) {
        switch (name) {
            case "trim":  return new TrimmingProcessor();
            case "upper": return new UpperCaseProcessor();
            case "lower": return new LowerCaseProcessor();
            case "length": return new LengthProcessor();
            case "reverse": return new ReverseProcessor();
        }
        throw new IllegalArgumentException("Bad name: " + name);
    }
}
