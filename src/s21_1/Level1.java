package s21_1;

public class Level1 {

    public static String[] TreeOfLife(int H, int W, int N, String[] tree) {
        if (H == 0 || W == 0 || tree.length == 0 || N == 0) {
            return tree;
        }

        char[][] chars = new char[H][W];
        function(chars, tree);

        int age = 0;
        int[][] ints = new int[H][W];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (chars[i][j] == '+') {
                    ints[i][j] = age + 1;
                } else {
                    ints[i][j] = age;
                }
            }
        }

        while (age < N) {
            age++;
            evenYear(ints);
            if (age % 2 == 0) {
                destroy(ints);
            }
        }
        return after(ints);
    }

    public static String[] after(int[][] ints) {
        String[] strings = new String[ints.length];

        for (int i = 0; i < ints.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] == 0) {
                    stringBuilder.append('.');
                } else {
                    stringBuilder.append('+');
                }
            }
            strings[i] = stringBuilder.toString();
        }
        return strings;
    }

    public static void evenYear(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] += 1;
            }
        }
    }

    public static void destroy(int[][] ints) {
        int size = ints.length * ints[0].length;
        int[] a = new int[size];
        int[] b = new int[size];
        int k = 0;

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] >= 3) {
                    a[k] = i;
                    b[k] = j;
                    k++;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                ints[a[i]][b[i]] = 0;
            } else if  (!(a[i] == 0 && b[i] == 0)) {
                ints[a[i]][b[i]] = 0;
            } else  {
                break;
            }
            if (a[i] > (0)) {
                ints[a[i] - 1][b[i]] = 0;
            }
            if (a[i] < (ints.length - 1)) {
                ints[a[i] + 1][b[i]] = 0;
            }
            if (b[i] > 0) {
                ints[a[i]][b[i] - 1] = 0;
            }
            if (b[i] < (ints[0].length - 1)) {
                ints[a[i]][b[i] + 1] = 0;
            }

        }
    }

    public static void function(char[][] chars, String[] strings) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                chars[i][j] = strings[i].charAt(j);
            }
        }
    }
}
