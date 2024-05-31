package src;

import java.util.HashMap;
public class TwoSum1 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] results = twoSum(nums, target);
        for (Integer i: results)
            System.out.println(i);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> stored_indices = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            int complement = target - nums[j];
            if (stored_indices.get(complement) != null)
                return new int[] {stored_indices.get(complement), j};
            stored_indices.put(nums[j], j);
        }
        return new int[0];
    }
}
