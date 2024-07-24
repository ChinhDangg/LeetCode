package src;

public class ThirdMaximumNumber414 {

    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        for (int num : nums) {
            if (num >= first) {
                if (num != first) {
                    third = second;
                    second = first;
                    first = num;
                }
            }
            else if (num >= second) {
                if (num != second) {
                    third = second;
                    second = num;
                }
            }
            else if (num > third)
                third = num;
        }
        return (int) ((third == Long.MIN_VALUE) ? first : third);
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));

        int[] nums2 = {1,2};
        System.out.println(thirdMax(nums2));

        int[] nums3 = {2,2,3,1};
        System.out.println(thirdMax(nums3));

        int[] nums4 = {1,2,2,5,3,5};
        System.out.println(thirdMax(nums4));
    }
}
