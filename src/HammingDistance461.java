package src;

public class HammingDistance461 {

    public static int hammingDistance(int x, int y) {
        int diff = x ^ y;
        int count = 0;
        while (diff != 0) {
            count += diff & 1;
            diff >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 1, y = 4;
        System.out.println(hammingDistance(x, y));

        int x1 = 3, y1 = 1;
        System.out.println(hammingDistance(x1, y1));
    }
}
