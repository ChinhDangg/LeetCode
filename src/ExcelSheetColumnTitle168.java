package src;

public class ExcelSheetColumnTitle168 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder col = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            col.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return col.reverse().toString();
    }

    public static void main(String[] args) {
        int columnNumber = 703;
        System.out.println(convertToTitle(columnNumber));
    }
}
