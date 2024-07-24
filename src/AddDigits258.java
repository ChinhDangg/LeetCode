package src;

public class AddDigits258 {
    public static int addDigits(int num) {
        if (num == 0)
            return 0;
        int result = num % 9;
        return (result == 0) ? 9 : result;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(0));
    }
}
