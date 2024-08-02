package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI496 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int current = nums2[i];
            while (!stack.isEmpty() && nums2[stack.peek()] <= current)
                stack.pop();
            if (!stack.isEmpty())
                map.put(current, nums2[stack.peek()]);
            else
                map.put(current, -1);
            stack.push(i);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++)
            result[i] = map.getOrDefault(nums1[i], -1);
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));

        int[] nums3 = {2,4}, nums4 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums3, nums4)));
    }
}
