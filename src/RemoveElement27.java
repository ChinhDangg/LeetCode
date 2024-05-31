package src;

public class RemoveElement27 {

    public static int removeElement(int[] nums, int val) {
        int current = 0;
        for (int j = 0; j < nums.length; j++)
            if (nums[j] != val) {
                nums[current] =  nums[j];
                current++;
            }
            else nums[j] = -1;
        return current;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(STR."k: \{removeElement(nums, val)}");
        for (int num : nums)
            System.out.println(num);
    }
}
