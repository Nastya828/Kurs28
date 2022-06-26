package s03;

public class Level1 {

    public static int searchMax(int[] a) {
        int max = a[0];
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] MadMax(int N, int[] Tele) {
        if (N == 1) {
            return Tele;
        } else {
            int middle = (N / 2);
            int indexMax = searchMax(Tele);
            Tele[middle] = Tele[indexMax] + Tele[middle];
            Tele[indexMax] = Tele[middle] - Tele[indexMax];
            Tele[middle] = Tele[middle] - Tele[indexMax];

            boolean flagAsc = false;
            while (!flagAsc) {
                flagAsc = true;
                for (int i = 0; i < middle - 1; i++) {
                    if (Tele[i] > Tele[i + 1]) {
                        flagAsc = false;
                        Tele[i] = Tele[i + 1] + Tele[i];
                        Tele[i + 1] = Tele[i] - Tele[i + 1];
                        Tele[i] = Tele[i] - Tele[i + 1];
                    }
                }
            }

            boolean flagDesc = false;
            while (!flagDesc) {
                flagDesc = true;
                for (int j = Tele.length - 1; j > middle + 1; j--) {
                    if (Tele[j] > Tele[j - 1]) {
                        flagDesc = false;
                        Tele[j] = Tele[j - 1] + Tele[j];
                        Tele[j - 1] = Tele[j] - Tele[j - 1];
                        Tele[j] = Tele[j] - Tele[j - 1];
                    }
                }
            }
        }
        return Tele;
    }

}
