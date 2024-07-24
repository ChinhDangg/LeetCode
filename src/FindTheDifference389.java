package src;

public class FindTheDifference389 {

    public static char findTheDifference(String s, String t) {
        int[] countS = new int[26];
        int[] countT = new int[26];
        for (int i = 0; i < s.length(); i++) {
            countS[s.charAt(i) - 'a']++;
            countT[t.charAt(i) - 'a']++;
        }
        countT[t.charAt(t.length()-1) - 'a']++;
        for (int i = 0; i < 26; i++)
            if (countS[i] != countT[i])
                return (char) (i + 'a');
        return (char) 0;
    }

    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));

        String s1 = "", t1 = "y";
        System.out.println(findTheDifference(s1, t1));
    }
}
