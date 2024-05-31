package src;

public class ExcelSheetColumnNumber171 {
    public static int titleToNumber(String columnTitle) {
        int num = 0;
        for (int j = 0; j < columnTitle.length(); j++)
            num += (int) Math.pow(26, columnTitle.length() - 1 - j) * (columnTitle.charAt(j) - 64);
        return num;
    }

    public static void main(String[] args) {
        String columnTitle = "AA";
        System.out.println(titleToNumber(columnTitle));
    }
}
