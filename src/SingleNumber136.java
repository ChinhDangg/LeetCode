package src;

public class SingleNumber136 {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums)
            result ^= num;
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int[] nums1 = {4,1,2,1,2};
        System.out.println(singleNumber(nums1));
    }
}
