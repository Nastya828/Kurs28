package s03;

public class Level1 {

    public static int[] sortAsc(int[] a) {
        boolean flagAsc = false;
        while (!flagAsc) {
            flagAsc = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    flagAsc = false;
                    a[i] = a[i + 1] + a[i];
                    a[i + 1] = a[i] - a[i + 1];
                    a[i] = a[i] - a[i + 1];
                }
            }
        }
        return a;
    }

    public static int[] sortDesc(int[] a) {
        boolean flagDesc = false;
        while (!flagDesc) {
            flagDesc = true;
            for (int j = a.length - 1; j > a.length / 2 + 1; j--) {
                if (a[j] > a[j - 1]) {
                    flagDesc = false;
                    a[j] = a[j - 1] + a[j];
                    a[j - 1] = a[j] - a[j - 1];
                    a[j] = a[j] - a[j - 1];
                }
            }
        }
        return a;
    }

    public static int[] MadMax(int N, int[] Tele) {
        if (N == 1) {
            return Tele;
        } else {
            int middle = (N / 2);
            sortAsc(Tele);
            Tele[middle] = Tele[Tele.length - 1] + Tele[middle];
            Tele[Tele.length - 1] = Tele[middle] - Tele[Tele.length - 1];
            Tele[middle] = Tele[middle] - Tele[Tele.length - 1];
            sortDesc(Tele);
        }
        return Tele;
    }

}
