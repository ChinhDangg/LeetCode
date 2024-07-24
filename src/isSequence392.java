package src;

public class isSequence392 {

    public static boolean isSequence(String s, String t) {
        if (s.isEmpty() || s.equals(t))
            return true;
        if (s.length() > t.length())
            return false;
        int startS = 0, startT = 0;
        while (startT < t.length()) {
            if (s.charAt(startS) == t.charAt(startT)) {
                startS++;
                if (startS == s.length())
                    return true;
            }
            startT++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSequence(s, t));

        String s1 = "axc", t1 = "ahbgdc";
        System.out.println(isSequence(s1, t1));

        System.out.println(isSequence("chinh", "tcjhliknjh"));
    }
}
