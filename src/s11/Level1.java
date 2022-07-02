package s11;

public class Level1 {

    public static String BigMinus(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();

        if ((l1 == l2 && s1.compareTo(s2) < 0) || l2 > l1) {
            String s = s1;
            s1 = s2;
            s2 = s;
        }

        for (int i = 0; i < Math.abs(l1 - l2); i++) {
            s2 = "0" + s2;
        }
        String result = "";
        int x = 0;

        for (int i = s1.length() - 1; i >= 0; i--) {
            int c = s1.charAt(i) - s2.charAt(i) + x;
            if (c < 0) {
                c += 10;
                x = -1;
            } else {
                x = 0;
            }
            result = c + result;

        }
        return result;
    }
}
