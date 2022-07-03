package s12;

import java.sql.PreparedStatement;

public class Level1 {
    public static String MassVote(int N, int[] Votes) {

        int max[] = maxArray(Votes);

        for (int i = 0; i < Votes.length; i++) {
            if ((i != max[1] && Votes[i] == max[0]) || Votes[0] == 0) {
                return "no winner";
            }
        }

        double summa = summaArray(Votes);
        double d = 0;
        if (summa != 0) {
            double p = (max[0] * 100) / summa;
            double x = Math.pow(10, 3);
            d = Math.ceil(p * x) / x;
        }

        if (d > 50) {
            return "majority winner " + (max[1] + 1);
        } else {
            return "minority winner " + (max[1] + 1);
        }
    }

    public static int[] maxArray(int[] a) {
        int max = a[0];
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                index = i;
                max = a[i];
            }
        }
        return new int[]{max, index};
    }

    public static int summaArray(int[] a) {
        int s = 0;
        for (int x : a) {
            s += x;
        }
        return s;
    }
}
