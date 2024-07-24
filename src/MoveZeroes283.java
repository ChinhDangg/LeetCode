package src;

import java.util.Arrays;
public class MoveZeroes283 {
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        if (len < 2)
            return;
        int current = 0;
        for (int j = 0; j < len; j++) {
            if (nums[j] != 0) {
                nums[current] = nums[j];
                current++;
            }
        }
        while (current < len) {
            nums[current] = 0;
            current++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}
