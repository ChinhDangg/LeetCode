package src;

public class Sqrtx69 {
    public static int mySqrt(int x) {
        int s = (int) Math.round(Math.exp(Math.log(x) / 2.0));
        return (s*s > x || s*s < -1) ? (s-1) : s;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }

}
