package src;

public class MaxConsecutiveOnes485 {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int num : nums) {
            if (num == 1)
                count++;
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));

        int[] nums1 = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums1));
    }

}
