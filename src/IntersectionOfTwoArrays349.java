package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays349 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length-1;
        int n2 = nums2.length-1;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        while (n1 >= 0 || n2 >= 0) {
            if (n1 >= 0) {
                set1.add(nums1[n1]);
                n1--;
            }
            if (n2 >= 0) {
                set2.add(nums2[n2]);
                n2--;
            }
        }
        set1.retainAll(set2);
        Integer[] temp = set1.toArray(new Integer[0]);
        int[] result = new int[temp.length];
        for (int j = 0; j < result.length; j++)
            result[j] = temp[j];
        return result;
    }

    public static int[] test(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int n1 : nums1)
            set1.add(n1);
        Set<Integer> set2 = new HashSet<>();
        for (int n2 : nums2)
            if (set1.contains(n2))
                set2.add(n2);
        int[] result = new int[set2.size()];
        int count = 0;
        for (int s : set2) {
            result[count] = s;
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        //System.out.println(Arrays.toString(intersection(nums1, nums2)));

        int[] nums3 = {1};
        int[] nums4 = {1,2};
        System.out.println(Arrays.toString(intersection(nums3, nums4)));
    }
}
