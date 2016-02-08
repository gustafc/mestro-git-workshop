package com.mestro.trams;

/**
 * Created by Sesdun on 2016-02-08.
 */
public class StringScrambler {

    public String scrabmle(String source) {

        char[] sarr = source.toCharArray();
        char a;
        int i1, i2;

        for(int i = 0; i < 1000; i++) {
            i1 = (int) (Math.random() * source.length());
            i2 = (int) (Math.random() * source.length());
            a = sarr[i1];
            sarr[i1] = sarr[i2];
            sarr[i2] = a;
        }

        return new String(sarr);
    }
}
