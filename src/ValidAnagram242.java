package src;

import java.util.*;

public class ValidAnagram242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        return Arrays.equals(ss, tt);
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int j = 0; j < s.length(); j++) {
//            char ss = s.charAt(j), tt = t.charAt(j);
//            if (!map.containsKey(ss))
//                map.put(ss, 1);
//            else
//                map.put(ss, map.get(ss) + 1);
//            if (!map.containsKey(tt))
//                map.put(tt, -1);
//            else
//                map.put(tt, map.get(tt) - 1);
//        }
//        for (Integer it : map.values())
//            if (it != 0)
//                return false;
//        return true;
    }

    public static void main(String[] args) {
        String s = "fe", t = "ja";
        System.out.println(isAnagram(s, t));
    }

}
