package s14;

public class Task14 {
    public static void main(String[] args) {

        int L = 10, N = 2;
        int[][] track  = {
                {11,5,5},
                {15,2,2}
        };

        int res = Level1.Unmanned(L, N, track);
        System.out.println("Время = " + res);

        int L1 = 20, N1 = 3;
        int[][] track1  = {
                {3,5,5},
                {5,2,3},
                {10,3,4}
        };
        int res1 = Level1.Unmanned(L1, N1, track1);
        System.out.println("Время1 = " + res1);

        int L2 = 5, N2 = 0;
        int[][] track2  = new int[N2][3];
        int res2 = Level1.Unmanned(L2, N2, track2);
        System.out.println("Время2 = " + res2);

    }
}
