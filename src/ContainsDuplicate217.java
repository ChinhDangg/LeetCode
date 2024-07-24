package src;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {

    public static boolean containsDuplicates(int[] nums) {
        Set<Integer> n = new HashSet<>();
        for (int num: nums)
            if (!n.add(num)) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        int[] nums2 = {1,2,3,4};
        System.out.println(containsDuplicates(nums));
    }
}
