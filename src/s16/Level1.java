package s16;

public class Level1 {

    public static void sort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            int j = i;
            while (j > 0 && a[j - 1] < x) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = x;
        }
    }

    public static int MaximumDiscount(int N, int[] price) {
        if (N < 3) {
            return 0;
        }
        sort(price);
        int sale = 0;
        for (int i = 2; i < price.length; i += 3) {
            sale += price[i];
        }
        return sale;
    }
}
