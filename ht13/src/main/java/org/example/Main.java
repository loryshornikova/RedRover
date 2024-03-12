package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static boolean doesContain (String s, char c) {
        return StringUtils.contains(s, c);
    }

    public static String reverseString(String str) {
        if(str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static double getRound (Double a) {
        if(a == null) {
            return 0;
        }
        return Math.round(a);
    }

}