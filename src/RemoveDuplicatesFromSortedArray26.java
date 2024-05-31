package src;

public class RemoveDuplicatesFromSortedArray26 {

    public static int removeDuplicates(int[] nums) { //worked even without sorted array - the answer for all
        if (nums.length == 0) return 0;
        java.util.HashMap<Integer, Integer> unique = new java.util.HashMap<>();
        for (int j = 0; j < nums.length; j++)
            if (unique.get(nums[j]) == null) {
                unique.put(nums[j], unique.size());
                nums[unique.get(nums[j])] = nums[j];
            }
        return unique.size();
    }

    public static int removeDuplicates2(int[] nums) { //worked for sorted array - the answer for this problem
        if (nums.length == 0) return 0;
        int current = 0;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] != nums[current]) {
                current++;
                nums[current] = nums[i];
            }
        return current + 1;
    }

    public static void main(String[] args) {
        int[] t = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(STR."Unique: \{removeDuplicates(t)}");
        for (int i : t)
            System.out.println(i);
    }
}
