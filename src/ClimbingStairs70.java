package src;

public class ClimbingStairs70 {
    public static int climbStairs(int n) {
        if (n <= 3)
            return n;
        int previous = 1, current = 2;
        for (int j = 3; j <= n; j++) {
            int next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(climbStairs(n));
    }
}
