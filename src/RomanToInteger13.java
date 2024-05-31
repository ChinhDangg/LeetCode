package src;

import java.util.HashMap;

public class RomanToInteger13 {

    public static int romanToInt(String s) {
        HashMap<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        roman.put("IV", 4);
        roman.put("IX", 9);
        roman.put("XL", 40);
        roman.put("XC", 90);
        roman.put("CD", 400);
        roman.put("CM", 900);

        int len = s.length();
        int num = 0;
        for (int j = 0; j < len; j++) {
            if (j+1 < len) {
                String twice = s.charAt(j) + "" + s.charAt(j + 1);
                if (roman.get(twice) != null) {
                    num += roman.get(twice);
                    j += 1;
                }
                else
                    num += roman.get(s.charAt(j)+"");
            }
            else
                num += roman.get(s.charAt(j)+"");
        }
        return num;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
