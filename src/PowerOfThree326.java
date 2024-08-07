package src;

public class PowerOfThree326 {

    public static boolean isPowerOfThree(int n) {
        if (n < 1)
            return false;
        while (n % 3 == 0)
            n /= 3;
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(-1));
        System.out.println(isPowerOfThree(45));
        System.out.println(isPowerOfThree(243));
    }
}
