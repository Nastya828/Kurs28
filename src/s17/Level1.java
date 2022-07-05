package s17;

public class Level1 {

    public static boolean func(char[] c, int x) {
        int k = 0;
        for (int i = x; i < c.length; i += x) {
            if (c[i] != '*') {
                return false;
            }
            k = i;
        }
        if (k == c.length - 1) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean LineAnalysis(String line) {

        char[] c = line.toCharArray();

        if (c[0] != '*' && c[c.length - 1] != '*') {
            return false;
        }
        if (c.length == 1 && c[0] == '*') {
            return true;
        }

        for (int i = 1; i < c.length; i++) {
            if (i != c.length - 1 && c[i] == '*') {
                return func(c, i);
            } else if (i == c.length - 1) {
                return true;
            }
        }
        return false;
    }
}

