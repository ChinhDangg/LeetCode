package src;

public class AddStrings415 {

    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int n1 = num1.length() -1, n2 = num2.length() -1;
        while (n1 >= 0 || n2 >= 0 || carry != 0) {
            int d1 = n1 < 0 ? 0 : num1.charAt(n1) - '0';
            int d2 = n2 < 0 ? 0 : num2.charAt(n2) - '0';

            int sum = d1 + d2 + carry;
            carry = sum / 10;
            result.append(sum % 10);

            n1--;
            n2--;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "11", num2 = "123";
        System.out.println(addStrings(num1, num2));

        String num3 = "456", num4 = "77";
        System.out.println(addStrings(num3, num4));

        String num5 = "0", num6 = "0";
        System.out.println(addStrings(num5, num6));
    }
}
