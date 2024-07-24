package src;

public class ValidPrefectSquare367 {

    public static boolean isPrefectSquare(int num) {
        int start = 1, end = num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long x = (long) mid * mid;
            if (x > num)
                end = mid - 1;
            else if (x < num)
                start = mid + 1;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPrefectSquare(16));
        System.out.println(isPrefectSquare(14));
        System.out.println(isPrefectSquare(4));
        System.out.println(isPrefectSquare(1));
        System.out.println(isPrefectSquare(2147483647));
    }
}

