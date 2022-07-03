package s13;

public class Level1 {

    public static int function(int x, int n) {

        int s = 0;
        int counter = 0;

        while (x != 0) {
            s += (x % 10) * Math.pow(n, counter);
            counter++;
            x /= 10;
        }
        return s;
    }


    public static int[] UFO(int N, int[] data, boolean octal) {
        int n;
        if (octal) {
            n = 8;
        } else {
            n = 16;
        }

        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = function(data[i], n);
        }
        return result;
    }
}
