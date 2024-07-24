package src;

public class RansomNote383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] mag = new int[26];
        for (char c : magazine.toCharArray()) {
            mag[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            int index = c - 'a';
            mag[index]--;
            if (mag[index] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));

        String ransomNote1 = "aa", magazine1 = "ab";
        System.out.println(canConstruct(ransomNote1, magazine1));

        String ransomNote2 = "aa", magazine2 = "aab";
        System.out.println(canConstruct(ransomNote2, magazine2));
    }
}
