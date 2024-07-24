package src;

import java.util.*;

public class IntersectionOfTwoArraysII350 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int k : nums1) {
            if (!map1.containsKey(k))
                map1.put(k, 1);
            else {
                map1.put(k, map1.get(k) + 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int j : nums2) {
            if (map1.containsKey(j)) {
                list.add(j);
                int count = map1.get(j) - 1;
                if (count == 0)
                    map1.remove(j);
                else
                    map1.put(j, count);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res = intersect(nums1, nums2);
        System.out.println(Arrays.toString(res));

        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};
        int[] res2 = intersect(nums3, nums4);
        System.out.println(Arrays.toString(res2));
    }
}
