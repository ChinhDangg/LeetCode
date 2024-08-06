package src;

import java.util.*;

public class KeyBoardRow500 {

    public static String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

        List<String> result = new ArrayList<>();
        for (String word : words) {
            boolean not1 = false, not2 = false, not3 = false;
            for (char ch : word.toLowerCase().toCharArray()) {
                if (!row1.contains(ch))
                    not1 = true;
                if (!row2.contains(ch))
                    not2 = true;
                if (!row3.contains(ch))
                    not3 = true;
            }
            if (!(not1 && not2 && not3))
                result.add(word);
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));

        String[] words2 = {"omk"};
        System.out.println(Arrays.toString(findWords(words2)));

        String[] words3 = {"adsdf","sfd"};
        System.out.println(Arrays.toString(findWords(words3)));
    }
}
