package src;

import java.util.HashMap;

public class WordPattern290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        HashMap<Character, String> map = new HashMap<>();
        for (int j = 0; j < pattern.length(); j++) {
            char c = pattern.charAt(j);
            if (!map.containsKey(c)) {
                if (map.containsValue(words[j]))
                    return false;
                map.put(c, words[j]);
            }
            else if (!map.get(c).equals(words[j]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));

        String pattern2 = "abba", s2 = "dog dog dog dog";
        System.out.println(wordPattern(pattern2, s2));
    }
}
