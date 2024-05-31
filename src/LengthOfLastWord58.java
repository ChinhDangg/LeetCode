package src;

public class LengthOfLastWord58 {
    public static int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        boolean found = false;
        int count = 0;
        for (int j = chars.length-1; j >= 0; j--) {
            if (chars[j] != ' ')
                count++;
            if (count > 0 && chars[j] == ' ')
                found = true;
            if (chars[j] == ' ' && found)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
