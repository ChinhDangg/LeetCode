package src;

import java.util.Arrays;

public class AssignCookies455 {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int childCount = 0, cookieCount = 0;
        while (childCount < g.length && cookieCount < s.length) {
            if (g[childCount] <= s[cookieCount])
                childCount++;
            cookieCount++;
        }
        return childCount;
    }

    public static void main(String[] args) {
        int[] g = {1,2,3}; int[] s = {1,1};
        System.out.println(findContentChildren(g, s));

        int[] g1 = {1,2}; int[] s1 = {1,2,3};
        System.out.println(findContentChildren(g1, s1));
    }
}
