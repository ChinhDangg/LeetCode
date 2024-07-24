package src;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0)
            return result;
        else if (nums.length == 1) {
            result.add(STR."\{nums[0]}");
            return result;
        }
        int start = nums[0];
        for (int j = 1; j < nums.length; j++) {
            int dif = Math.abs(nums[j] - nums[j-1]);
            if (dif > 1) {
                if (nums[j-1] == start)
                    result.add(STR."\{start}");
                else
                    result.add(STR."\{start}->\{nums[j - 1]}");
                start = nums[j];
            }
            if (j == nums.length-1) {
                if (dif > 1)
                    result.add(STR."\{nums[j]}");
                else
                    result.add(STR."\{start}->\{nums[j]}");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        int[] nums2 = {0,2,3,4,6,8,9};
        int[] nums3 = {-2147483648,-2147483647,2147483647};
        List<String> r = summaryRanges(nums3);
        for (String t : r)
            System.out.println(t);
    }
}
