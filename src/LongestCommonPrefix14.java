package src;

public class LongestCommonPrefix14 {

    public static void main(String[] args) {
        String[] t = { "flower","flow","flight" };
        System.out.println(longestCommonPrefix(t));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        else if (strs.length == 0)
            return "";

        String prefix = strs[0];
        for (int j = 1; j < strs.length; j++) {
            while (!(strs[j].startsWith(prefix))) {
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
