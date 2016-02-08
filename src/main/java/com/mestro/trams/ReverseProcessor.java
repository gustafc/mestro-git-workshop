package com.mestro.trams;

import java.lang.StringBuilder;

public class ReverseProcessor implements Processor {
    @Override
    public String process(String source) {

        StringBuilder sb = new StringBuilder(source);

        return sb.reverse().toString();
    }
}
