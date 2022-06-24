package s01;

public class Level1 {
    public static int odometer(int[] oksana) {
        int S = 0;
        for (int i = 0; i < oksana.length - 1; i += 2) {
            if (i == 0) {
                S += oksana[i] * oksana[i + 1];
            } else {
                S += oksana[i] * (oksana[i + 1] - oksana[i - 1]);
            }
        }
        return S;
    }
}
