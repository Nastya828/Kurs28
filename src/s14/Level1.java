package s14;

public class Level1 {

    public static int function(int way, int red, int green) {

        int f = way % (red + green);

        if (f == 0) {
            return red;
        } else if (f < red) {
            return (red - f);
        } else {
            return 0;
        }
    }


    public static int Unmanned(int L, int N, int[][] track) {
        if (N == 0 || track[0][0] >= L) {
            return L;
        }

        int way = 0;
        int index = -1;
        for (int i = 0; i < track.length; i++) {
            if (track[i][0] < L) {
                if (i == 0) {
                    way += track[i][0];
                } else {
                    way += track[i][0] - track[i - 1][0];
                }
                way += function(way, track[i][1], track[i][2]);
            } else {
                index = i - 1;
                break;
            }
        }
        if (index != -1) {
            way += L - track[index][0];
        } else {
            way += L - track[N - 1][0];
        }
        return way;
    }
}
