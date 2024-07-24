package src;

import java.util.*;

public class ReverseVowelsOfAString345 {
    public static String reverseVowels(String s) {
        if (s.isBlank())
            return s;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder result = new StringBuilder(s);
        int start = 0, end = s.length()-1;
        while (start < end) {
            char sChar = s.charAt(start);
            char eChar = s.charAt(end);
            if (vowels.contains(sChar)) {
                 if (vowels.contains(eChar)) {
                     result.setCharAt(start, eChar);
                     result.setCharAt(end, sChar);
                     start++;
                 }
                 end--;
            }
            else start++;
        }
        return result.toString();
    }

    public static String reverseVowels2(String s) {
        if (s.isBlank())
            return s;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] chars = s.toCharArray();
        int start = 0, end = s.length()-1;
        while (start < end) {
            char sChar = s.charAt(start);
            char eChar = s.charAt(end);
            if (vowels.contains(sChar)) {
                if (vowels.contains(eChar)) {
                    chars[start] = eChar;
                    chars[end] = sChar;
                    start++;
                }
                end--;
            }
            else start++;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "hello", s1 = "leetcode";
        System.out.println(reverseVowels(s));
        System.out.println(reverseVowels(s1));

        System.out.println(reverseVowels2(s));
        System.out.println(reverseVowels2(s1));
    }
}
