package src;

import java.util.Arrays;

public class CountingBits338 {
    public static int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int j = 0; j < result.length; j++)
            result[j] = Integer.bitCount(j);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
        System.out.println(Arrays.toString(countBits(5)));
    }
}
