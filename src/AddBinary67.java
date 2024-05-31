package src;

public class AddBinary67 {
    public static String addBinary(String a, String b) {
        int first = a.length()-1;
        int second = b.length()-1;
        int carry = 0;
        StringBuilder added = new StringBuilder();
        while (first >= 0 || second >= 0) {
            int sum = carry;
            if (first >= 0) {
                sum += a.charAt(first) - '0';
                first--;
            }
            if (second >= 0) {
                sum += b.charAt(second) - '0';
                second--;
            }
            added.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0)
            added.append(carry);
        return added.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }
}
