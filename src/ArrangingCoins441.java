package src;

public class ArrangingCoins441 {

    public static int arrangeCoins(int n) {
        return (int) (Math.sqrt(1 + 8 * (long) n) - 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
    }
}
