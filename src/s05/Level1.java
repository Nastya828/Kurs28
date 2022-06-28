package s05;

public class Level1 {

    public static double search(int x, int y) {
        int[][] matrix = {
                {6, 1, 9},
                {5, 2, 8},
                {4, 3, 7}
        };
        int pathNext = 1;
        double pathD = Math.sqrt(Math.pow(pathNext, 2.0) + Math.pow(pathNext, 2.0));
        int[] index = new int[4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == x) {
                    index[0] = i;
                    index[1] = j;
                } else if (matrix[i][j] == y) {
                    index[2] = i;
                    index[3] = j;
                }
            }
        }
        if (index[0] == index[2] || index[1] == index[3]) {
            return pathNext;
        } else {
            return pathD;
        }
    }

    public static String PatternUnlock(int N, int[] hits) {
        double summa = 0.0;
        for (int i = 0; i < N - 1; i++) {
            double way = search(hits[i], hits[i + 1]);
            summa += way;
        }

        StringBuilder str = new StringBuilder();
        String s = String.format("%.5f", summa);
        for (char aChar : s.toCharArray()) {
            if (!(aChar == '0' || aChar == '.')) {
                str.append(aChar);
            }
        }
        if (str.length() == 1) {
            return String.valueOf(str.charAt(0));
        } else {
            return str.toString();
        }
    }
}
