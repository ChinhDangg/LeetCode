package src;

import java.util.Arrays;

public class ArrayPartition561 {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length; i += 2)
            max += nums[i];
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,4,3,2};
        System.out.println(arrayPairSum(nums));
        int[] nums2 = new int[] {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums2));
    }
}
