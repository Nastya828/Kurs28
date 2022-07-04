package s14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Test {

    @Test
    void unmanned() {
        int[][]x = {
                {11,5,5},
                {15,2,2}
        };
        Assertions.assertEquals(Level1.Unmanned(10, 2, x) , 10);

        int L = 10, N = 2;
        int[][] track  = {
                {3,5,5},
                {15,2,2}
        };
        Assertions.assertEquals(Level1.Unmanned(L, N, track) , 12);


        int L1 = 20, N1 = 3;
        int[][] track1  = {
                {3,5,5},
                {5,2,3},
                {10,3,4}
        };
        Assertions.assertEquals(Level1.Unmanned(L1, N1, track1) , 22);

        int L2 = 5, N2 = 0;
        int[][] track2  = new int[N2][3];
        Assertions.assertEquals(Level1.Unmanned(L2, N2, track2) , L2);
    }
}