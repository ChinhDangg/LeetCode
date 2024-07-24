package src;

import java.util.HashMap;

public class LongestPalindrome409 {

    public static int longestPalindrome(String s) {
        if (s.length() == 1)
            return 1;
        int[] occurrences = new int[58];
        for (int i = 0; i < s.length(); i++)
            occurrences[s.charAt(i) - 'A']++;
        int sum = 0;
        for (int i = 0; i < 58; i++)
            if (occurrences[i] % 2 == 0)
                sum += occurrences[i];
            else
                sum += occurrences[i] - 1;
        return (sum < s.length()) ? (sum+1) : sum;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
        String s1 = "abcc";
        System.out.println(longestPalindrome(s1));
        String s2 = "a";
        System.out.println(longestPalindrome(s2));
        String s3 = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPalindrome(s3));
    }
}
