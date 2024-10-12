package src;

public class LongestUncommonSubsequenceI521 {

    public static int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        return Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {
        System.out.println(findLUSlength("aba", "cdc"));
        System.out.println(findLUSlength("aaa", "bbb"));
        System.out.println(findLUSlength("aaa", "aaa"));
    }
}
