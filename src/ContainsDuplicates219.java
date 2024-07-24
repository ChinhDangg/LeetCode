package src;

import java.util.HashMap;

public class ContainsDuplicates219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> unq = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            if (unq.containsKey(nums[j])) {
                if (j - unq.get(nums[j]) <= k)
                    return true;
            }
            unq.put(nums[j], j);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int[] nums2 = {1,0,1,1};
        int[] nums3 = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(nums3, 2));
    }
}
