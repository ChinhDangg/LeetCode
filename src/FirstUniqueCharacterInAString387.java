package src;

import java.util.HashMap;

public class FirstUniqueCharacterInAString387 {

    public static int firstUniqChar(String s) {
        int[] letters = new int[26];
        for (char c : s.toCharArray())
            letters[c - 'a']++;
        for (int j = 0; j < s.length(); j++)
            if (letters[s.charAt(j) - 'a'] == 1)
                return j;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }
}
