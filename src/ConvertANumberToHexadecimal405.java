package src;

public class ConvertANumberToHexadecimal405 {

    public static String toHex(int num) {
        if (num == 0)
            return "0";
        char[] hexChars = "0123456789abcdef".toCharArray();
        long n = num;
        if (n < 0)
            n = (long)(Math.pow(2, 32)) + n;

        StringBuilder hex = new StringBuilder();
        while (n > 0) {
            int remainder = (int)(n % 16);
            hex.append(hexChars[remainder]);
            n /= 16;
        }
        return hex.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(toHex(-1));
        System.out.println(toHex(26));
    }
}
