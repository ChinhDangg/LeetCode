package src;

public class PlusOne66 {
    public static int[] plusOne(int[] digits) {
        for (int j = digits.length-1; j >= 0; j--) {
            digits[j]++;
            if (digits[j] < 10)
                return digits;
            digits[j] = 0;
        }
        int[] leadingOne = new int[digits.length + 1];
        leadingOne[0] = 1;
        return leadingOne;
    }

    public static void main(String[] args) {
        int[] digits = {9,8,9,9};
        int[] copy = plusOne(digits);
        for (Integer t : copy)
            System.out.println(t);
    }
}
