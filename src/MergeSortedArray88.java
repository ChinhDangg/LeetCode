package src;

public class MergeSortedArray88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m - 1;
        int n2 = n - 1;
        int end = m + n - 1;
        while (n1 >= 0 && n2 >= 0) {
            if (nums1[n1] > nums2[n2]) {
                nums1[end] = nums1[n1];
                n1--;
            }
            else {
                nums1[end] = nums2[n2];
                n2--;
            }
            end--;
        }
        while (n2 >= 0) {
            nums1[end] = nums2[n2];
            n2--;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,6,0,0,0}, nums2 = {1,2,3};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        for (int n1 : nums1)
            System.out.println(n1);
    }
}
