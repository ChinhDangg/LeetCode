package src;

public class ReverseWordsInAStringIII557 {

    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length - 1;
        int start = 0;
        for (int end = 0; end <= len; end++) {
            if (chars[end] == ' ') {
                reverse(chars, start, end-1);
                start = end + 1;
            }
        }
        reverse(chars, start, len);
        return new String(chars);
    }

    private static void reverse(char[] chars, int start, int end) {
        char temp;
        while (start < end) {
            temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello World"));
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("Mr Ding"));
    }
}
