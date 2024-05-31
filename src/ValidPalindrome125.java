package src;

public class ValidPalindrome125 {

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder b = new StringBuilder(s);
        return s.contentEquals(b.reverse());
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "race a car";
        String s2 = " ";
        System.out.println(isPalindrome(s2));
    }
}
