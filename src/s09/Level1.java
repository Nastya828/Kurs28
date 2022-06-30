package s09;

public class Level1 {

    public static char[][] matrix(String s) {
        double x = Math.sqrt(s.length());
        int n = (int) x;
        int m = (int) x + 1;
        char[][] matrix;
        if (n * m >= s.length()) {
            matrix = new char[n][m];
        } else {
            while (s.length() > n * m) {
                n++;
            }
            matrix = new char[n][m];
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (k < s.length()) {
                    matrix[i][j] = s.charAt(k);
                } else {
                    matrix[i][j] = ' ';
                }
                k++;
            }
        }
        return matrix;
    }

    public static String TheRabbitsFoot(String s, boolean encode) {
        String result;
        char[][] matrix1;
        if (encode) {
            result = s.replace(" ", "");
            matrix1 = matrix(result);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < matrix1[0].length; i++) {
                for (int j = 0; j < matrix1.length; j++) {
                    if (matrix1[j][i] != ' ') {
                        stringBuilder.append(matrix1[j][i]);
                    }
                }
                if (i < matrix1[0].length - 1) {
                    stringBuilder.append(" ");
                }
            }
            result = stringBuilder.toString();

        } else {
            int n;
            int m;
            String[] strings = s.split(" ");
            m = strings.length;
            n = max(strings);
            matrix1 = new char[n][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < strings[i].length()) {
                        matrix1[j][i] = strings[i].charAt(j);
                    } else {
                        matrix1[j][i] = ' ';
                    }
                }
            }
            StringBuilder resultBuilder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    resultBuilder.append(matrix1[i][j]);
                }
            }
            result = resultBuilder.toString();
        }
        return result;
    }

    public static int max(String[] a) {
        int max = a[0].length();
        for (String s : a) {
            if (s.length() >= max) {
                max = s.length();
            }
        }
        return max;
    }
}


