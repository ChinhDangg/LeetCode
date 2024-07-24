package src;

public class RangeSumQuery303 {
    public static class NumArray {
        private final int[] sum;
        public NumArray(int[] nums) {
            sum = new int[nums.length];
            sum[0] = nums[0];
            for (int j = 1; j < sum.length; j++)
                sum[j] = sum[j-1] + nums[j];
        }
        public int sumRange(int left, int right) {
            if (left == 0)
                return sum[right];
            return sum[right] - sum[left-1];
        }
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2)); // return (-2) + 0 + 3 = 1
        System.out.println(numArray.sumRange(2, 5)); // return 3 + (-5) + 2 + (-1) = -1
        System.out.println(numArray.sumRange(0, 5)); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
    }
}
