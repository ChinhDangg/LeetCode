package src;

public class Base7504 {

    public static String convertToBase7(int num) {
        int copy = Math.abs(num);
        int quotient = copy / 7;
        int remainder = copy % 7;
        StringBuilder result = new StringBuilder();
        while (quotient >= 0) {
            result.append(remainder);
            remainder = quotient % 7;
            if (quotient == 0)
                break;
            quotient = quotient / 7;
        }
        if (num < 0)
            result.append("-");
        return result.reverse().toString();
    }

    public static String convertToBase7Ver2(int num) { //the best answer
        return Integer.toString(num, 7);
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println(convertToBase7(num));

        int num2 = -7;
        System.out.println(convertToBase7(num2));
    }
}
