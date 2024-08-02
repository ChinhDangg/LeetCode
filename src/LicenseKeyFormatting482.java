package src;

public class LicenseKeyFormatting482 {

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder license = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                if (count >= k) {
                    count = 0;
                    license.append("-");
                }
                license.append(Character.toUpperCase(s.charAt(i)));
                count++;
            }
        }
        return license.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "2-5g-3-J";
        int k = 2;
        System.out.println(licenseKeyFormatting(s, k));

        String s1 = "5F3Z-2e-9-w";
        int k1 = 4;
        System.out.println(licenseKeyFormatting(s1, k1));
    }
}
