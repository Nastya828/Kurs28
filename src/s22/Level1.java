package s22;

import java.util.ArrayList;
import java.util.Arrays;


public class Level1 {

    public static boolean TransformTransform(int[] A, int N) {

        int[] intFirst = S(A);
        int[] secondList = S(intFirst);
        int summa = 0;
        for (int n : secondList) {
            summa += n;
        }
        return summa % 2 == 0;
    }

    public static int[] S(int[] A) {
        ArrayList<Integer> bList = new ArrayList<>();
        int k;
        int max;
        for (int i = 0; i <= A.length - 1; i++) {
            for (int j = 0; j <= (A.length - i - 1); j++) {
                k = i + j;
                max = A[j];
                for (int t = j; t <= k; t++) {
                    if (A[t] >= max) {
                        max = A[t];
                    }
                }
                bList.add(max);
            }
        }
        int[] result = new int[bList.size()];
        for (int i = 0; i < bList.size(); i++) {
            result[i] = bList.get(i);
        }
        return result;
    }
}
