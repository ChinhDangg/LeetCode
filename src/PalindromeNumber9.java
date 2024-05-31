package src;

public class PalindromeNumber9 {

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int x2 = x;
        int reversed = 0;
        while (x2 > 0) {
            int lastDigit = x2 % 10;
            reversed = reversed * 10 + lastDigit;
            x2 /= 10;
        }
        return reversed == x;
    }

    public static void main(String[] args) {
        int x = 12345421;
        System.out.println(isPalindrome(x));
    }
}
