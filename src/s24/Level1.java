package s24;

import java.util.Arrays;

public class Level1 {

    public static boolean Football(int[] F, int N) {
        if (order(F) || N == 1) {
            return false;
        }

        int[] f1 = Arrays.copyOf(F, F.length);

        for (int i = 0; i < F.length; i++) {
            for (int j = 0; j < F.length; j++) {
                if (i != j) {
                    f1 = funcFirst(F, i, j);
                }
                if (order(f1)) {
                    return true;
                }
            }
        }

        int k;
        for (int i = 1; i <= F.length - 1; i++) {
            for (int j = 0; j <= (F.length - i - 1); j++) {
                k = i + j;
                int[] f2 = funcSecond(F, j, k);
                if (order(f2)) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean order(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] funcFirst(int[] F, int i, int j) {
        int[] a = Arrays.copyOf(F, F.length);
        int x = a[i];
        a[i] = a[j];
        a[j] = x;
        return a;
    }

    public static int[] funcSecond(int[] F, int i, int j) {
        int[] a = Arrays.copyOf(F, F.length);

        while (i < j && j > 0 && i < a.length) {
            a = funcFirst(a, i, j);
            i++;
            j--;
        }
        return a;
    }

}
