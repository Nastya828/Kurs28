package s21_2;


public class Level1 {
    public static void function(int[][] ints, String[] strings) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = strings[i].charAt(j) - 48;
            }
        }
    }

    public static void MatrixTurn(String[] Matrix, int M, int N, int T) {
        int[][] ints = new int[M][N];
        function(ints, Matrix);

        while (T > 0) {
            T--;
            turn(ints);
        }

        for (int i = 0; i < ints.length; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < ints[i].length; j++) {
                str.append(ints[i][j]);
            }
            Matrix[i] = str.toString();
        }
    }

    public static void turn(int[][] ints) {
        int min = Math.min(ints.length, ints[0].length);
        int[][] res = new int[ints.length][ints[0].length];
        for (int x = 0; x < min / 2; x++) {
            for (int i = x; i < ints.length; i++) {
                for (int j = x; j < ints[i].length; j++) {
                    if (j < ints[i].length - (x + 1) && i == x) {
                        res[i][j + 1] = ints[i][j];
                    } else if (j == ints[i].length - (x + 1) && i < ints.length - (x + 1)) {
                        res[i + 1][j] = ints[i][j];
                    } else if (j > x && j <= ints[i].length - (x + 1) && i == ints.length - (x + 1)) {
                        res[i][j - 1] = ints[i][j];
                    } else if (j == x && i > x && i <= ints.length - (x + 1)) {
                        res[i - 1][j] = ints[i][j];
                    }
                }

            }
        }
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = res[i][j];
            }
        }
    }
}
