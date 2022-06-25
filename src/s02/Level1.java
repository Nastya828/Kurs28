package s02;

public class Level1 {

    public static boolean findPointNull(int[][] fields) {
        for (int[] a : fields) {
            for (int x : a) {
                if (x == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] value(int[][] field, int x, int y, int day) {
        if (0 <= x && x < field.length && 0 <= y && y < field[0].length && field[x][y] == 0) {
            field[x][y] = day;
        }
        return field;
    }


    public static int ConquestCampaign(int N, int M, int L, int[] battalion) {
        int counterDays = 1;
        int[][] field = new int[N][M];

        for (int i = 0; i < battalion.length - 1; i += 2) {
            int x = battalion[i];
            int y = battalion[i + 1];
            field[x - 1][y - 1] = -1;
        }

        boolean flag = findPointNull(field);
        while (!flag) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (((field[i][j] == -1) || (field[i][j] == counterDays)) && counterDays >= 1) {
                        value(field, i - 1, j, counterDays + 1);
                        value(field, i + 1, j, counterDays + 1);
                        value(field, i, j - 1, counterDays + 1);
                        value(field, i, j + 1, counterDays + 1);

                    }
                }
            }
            counterDays++;
            flag = findPointNull(field);
        }
        return counterDays;
    }

}
