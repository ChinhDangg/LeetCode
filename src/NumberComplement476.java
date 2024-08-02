package src;

public class NumberComplement476 {

    public static int findComplement(int num) {
        int len = Integer.toBinaryString(num).length();
        return num ^ ((1 << len) - 1);
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
        System.out.println(findComplement(1));
    }
}
