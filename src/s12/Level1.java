package s12;

import java.sql.PreparedStatement;

public class Level1 {
//    получает на вход количество кандидатов N >= 1 и массив, содержащий N голосов, отданных за
//  соответствующих кандидатов. На выходе формируется строка в одном из трёх форматов:
//   1) "majority winner K" если имеется победитель с номером K (начиная с 1), набравший более 50% голосов.
//   Для случая 60, 10, 10, 15, 5 строка примет вид
//    majority winner 1
//    2) "minority winner K" если имеется победитель с номером K (начиная с 1), набравший менее 50% голосов.
//    Для случая 10, 15, 10 строка примет вид
//    minority winner 2

//   3) "no winner" если победителя не выявлено.

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
            double x = Math.pow(10, 2);
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
