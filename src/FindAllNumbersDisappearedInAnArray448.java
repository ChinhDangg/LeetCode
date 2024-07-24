package src;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray448 {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int j = 0; j < nums.length; j++) {
            int val = Math.abs(nums[j]) - 1;
            if (nums[val] > 0)
                nums[val] = -nums[val];
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                result.add(i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
        int[] nums1 = {1,1};
        System.out.println(findDisappearedNumbers(nums1));
        int[] nums2 = {1};
        System.out.println(findDisappearedNumbers(nums2));
        int[] nums3 = {1,2};
        System.out.println(findDisappearedNumbers(nums3));
    }
}
