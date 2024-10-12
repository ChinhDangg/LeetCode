package src;

public class DetectCapital520 {

    public static boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        boolean allUpper = true, allLower = true;
        for (int i = 1; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i]))
                allLower = false;
            else
                allUpper = false;
            if (!allUpper && !allLower)
                return false;
        }
        return Character.isUpperCase(chars[0]) || allLower;
    }

    public static void main(String[] args) {
        String word = "USA";
        System.out.println(detectCapitalUse(word));

        String word2 = "FlaG";
        System.out.println(detectCapitalUse(word2));
    }
}
