package src;

public class StudentAttendanceRecordI551 {

    public static boolean checkRecord(String s) {
        int absent = 0, late = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == 'A') {
                absent += 1;
                if (absent > 1)
                    return false;
                late = 0;
            } else if (aChar == 'L') {
                late += 1;
                if (late > 2)
                    return false;
            } else
                late = 0;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
    }
}
