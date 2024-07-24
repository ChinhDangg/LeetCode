package src;

public class UglyNumber263 {
    public static boolean isUgly(int n) {
        if (n == 1)
            return true;
        else if (n <= 0)
            return false;
        while (n > 1) {
            if (n % 5 == 0) {
                n /= 5;
                if (1220703125 % n == 0)
                    return true;
            }
            else if (n % 3 == 0) {
                n /= 3;
                if (1162261467 % n == 0)
                    return true;
            }
            else if (n % 2 == 0) {
                n /= 2;
                if ((n & (n - 1)) == 0)
                    return true;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(9765625));
    }
}
