package src;

public class RepeatedSubstringPattern459 {

    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length(), half = len / 2;
        for (int i = 1; i <= half; i++) {
            if (len % i == 0) {
                String sub = s.substring(0, i);
                String repeated = sub.repeat(len / i);
                if (s.contentEquals(repeated))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));

        String s1 = "aba";
        System.out.println(repeatedSubstringPattern(s1));

        String s2 = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s2));
    }
}
