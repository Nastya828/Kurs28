package s08;

public class Level1 {

    public static int summa(int index, int[] array) {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                summa += array[i];
            }
        }
        return summa;

    }

    public static int SumOfThe(int N, int[] data) {
        for (int i = 0; i < N; i++) {
            if (data[i] == summa(i, data)) {
                return data[i];
            }
        }
        return 0;
    }
}
