package src;

public class GuessNumberHigherOrLower374 {

    public static int guessNumber(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = (int) (((long) start + end) / 2);
            if (guess(mid) == -1)
                end = mid - 1;
            else if (guess(mid) == 1)
                start = mid + 1;
            else
                return mid;
        }
        return start;
    }

    private static int guess(int n) {
        int number = 1702766719;
        if (n == number) return 0;
        else if (n < number) return 1;
        else return -1;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(2126753390));
    }
}
