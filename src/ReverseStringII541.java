package src;

public class ReverseStringII541 {

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i += 2 * k) {
            int end = Math.min(i+k-1, len-1);
            int start = i;
            while (start < end) {
                char temp = chars[start];
                chars[start++] = chars[end];
                chars[end--] = temp;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcd", 2));
        System.out.println(reverseStr("abcdeg", 10));
        System.out.println(reverseStr("abcdefg", 1));
    }
}
