package s15;

public class Level1 {

    public static boolean search(int i, int j, int[][] mapFirst, int[][] mapSecond) {

        int a = mapSecond.length;
        int b = mapSecond[0].length;
        int[][] flag = new int[a][b];

        for (int k = i, y = 0; k < (i + a) && y < a; k++, y++) {
            for (int t = j, z = 0; t < (j + b) && z < b; t++, z++) {
                flag[y][z] = mapFirst[k][t];

            }
        }
        for (int k = 0; k < a; k++) {
            for (int t = 0; t < b; t++) {
                if (mapSecond[k][t] != flag[k][t]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] stringToArray(int n, int m, String s) {

        int[][] array = new int[n][m];
        String[] strings = s.split(" ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = strings[i].charAt(j) - 48;
            }
        }
        return array;
    }

    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {

        int[][] mapFirst = stringToArray(H1, W1, S1);

        int[][] mapSecond = stringToArray(H2, W2, S2);

        if (H2 == 0 || H2 > H1 || W2 > W1) {
            return false;
        }
        boolean result = false;
        for (int i = 0; i < mapFirst.length; i++) {
            for (int j = 0; j < mapFirst[i].length; j++) {
                if (mapFirst[i][j] == mapSecond[0][0]) {
                    result = search(i, j, mapFirst, mapSecond);
                }
            }
        }
        return result;
    }
}
