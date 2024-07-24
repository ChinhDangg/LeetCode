package src;

public class PowerOfFour342 {
    public static boolean isPowerOfFour(int n) {
        if (n < 1)
            return false;
        while (n % 4 == 0)
            n /= 4;
        return n == 1;
    }

    public static void main(String[] args) {
        for (int j = 0; j < 14; j++) {
            int num = (int) Math.pow(4, j);
            System.out.println(STR."\{num}: \{isPowerOfFour(num)}");
        }
    }
}
