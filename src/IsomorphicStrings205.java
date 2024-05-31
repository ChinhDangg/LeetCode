package src;

import java.util.HashMap;

public class IsomorphicStrings205 {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> pairS = new HashMap<>();
        HashMap<Character, Character> pairT = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            if (pairS.get(s.charAt(j)) == null)
                pairS.put(s.charAt(j), t.charAt(j));
            else if (pairS.get(s.charAt(j)) != t.charAt(j))
                return false;
            if (pairT.get(t.charAt(j)) == null)
                pairT.put(t.charAt(j), s.charAt(j));
            else if (pairT.get(t.charAt(j)) != s.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "paper", t = "title";
        String s1 = "badc", t1 = "baba";
        String s2 = "foo", t2 = "bar";
        System.out.println(isIsomorphic(s, t));
        System.out.println(isIsomorphic(s1, t1));
        System.out.println(isIsomorphic(s2, t2));
    }
}
