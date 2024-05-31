package src;

public class ReverseBits190 {
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            if ((n & 1) == 1)
                result |= 1;
            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = -1610612736;
        System.out.println(reverseBits(n));
    }
}

/*
&: and operation: compare each corresponding bit, if both is 1 then 1 else 0
|: or operation: compare each corresponding bit, if either one is 1 then 1 else 0
fact: comparing to number 1 with & operand will check if least significant bit (first digit) is 1 or not or even or odd
the | operand of the number with number 1 will flip the least significant bit of the number to 1 while
keeping all others number the same (make sense as 1 is kept as 1)
 */