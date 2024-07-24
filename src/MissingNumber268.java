package src;

public class MissingNumber268 {

    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int total = (len * (len + 1))/2;
        for (int num : nums)
            total -= num;
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int[] nums2 = {0,1};
        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
        System.out.println(missingNumber(nums2));
        System.out.println(missingNumber(nums3));
    }
}
