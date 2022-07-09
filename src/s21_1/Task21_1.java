package s21_1;

import java.util.Arrays;

public class Task21_1 {
    public static void main(String[] args) {
        int H = 3;
        int W = 4;
        int N = 4;
        String[] strings = {".+..","..+.",".+.."};

        String[] result = Level1.TreeOfLife(H, W, N, strings);
        System.out.println(Arrays.toString(result));
    }
}
