package src;

public class SearchInsertPosition35 {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int half = (end - start) / 2;

        if (target < nums[start])
            return start;
        else if (target > nums[end])
            return nums.length;

        while ((end-start) != 1) {
            if (nums[half] < target) {
                start = half;
                half = start + (end - start) / 2;
            }
            else if (nums[half] > target) {
                end = half;
                half = start + (end - start) / 2;
            }
            else
                return half;
        }
        if (target == nums[end] || (target > nums[start] && target < nums[end]))
            return end;
        else
            return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,7,8};
        int target = 3;
        System.out.println(searchInsert(nums, target));
    }
}
