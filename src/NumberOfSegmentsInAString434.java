package src;

import java.util.StringTokenizer;

public class NumberOfSegmentsInAString434 {

    public static int countSegments(String s) {
        if(s.isEmpty())
            return 0;
        StringTokenizer word = new StringTokenizer(s);
        return word.countTokens();
    }

    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));

        String s1 = "Hello";
        System.out.println(countSegments(s1));

        String s2 = "";
        System.out.println(countSegments(s2));

        String s3 = ", , , ,        a, eaefa";
        System.out.println(countSegments(s3));
    }
}
