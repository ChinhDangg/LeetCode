package src;

public class FirstBadVersion278 {

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle))
                right = middle;
            else
                left = middle + 1;
        }
        return left;
    }

    public static boolean isBadVersion(int version) {
        return version >= 1;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(firstBadVersion(n));
    }
}
