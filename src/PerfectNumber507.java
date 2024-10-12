package src;

public class PerfectNumber507 {

    public static boolean checkPerfectNumber(int num) {
        if (num < 2)
            return false;
        int sum = 1;
        int max = num;
        for (int i = 2; i < max; i++) {
            if (num % i == 0) {
                sum += i;
                int other = num / i;
                if (other != i) {
                    sum += other;
                    max = other;
                }
                if (sum > num)
                    return false;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
        System.out.println(checkPerfectNumber(7));
    }
}
