package src;

public class MajorityElement169 {
    public static int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0)
                element = num;
            count += (num == element) ? 1 : -1;
        }
        return element;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,1,2,1,1,2,2,3,2,2,5,2};
        System.out.println(majorityElement(nums));
    }
}
