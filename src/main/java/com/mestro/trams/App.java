package com.mestro.trams;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class App {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: <processor> <string>");
            System.exit(1);
        }
        String input = Stream.of(args).skip(1).collect(joining(" "));
        String output = Processor.forName(args[0]).process(input);
        System.out.printf(" Input: %s%nOutput: %s%n", input, output);
    }
}
