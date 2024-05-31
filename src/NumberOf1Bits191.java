package src;

public class NumberOf1Bits191 {
    public static int hammingWeight(int n) {
        int count = 0;
        int copy = n;
        for (int j = 0; j < 32; j++) {
            if ((n & 1) == 1)
                count++;
            n >>= 1;
            if (Math.pow(2, j) >= copy)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 2147483645;
        System.out.println(hammingWeight(n));
    }
}
