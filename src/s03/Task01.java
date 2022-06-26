package s03;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] a = {4, 1, 44, 255, 7, 43, 8, 11, 9};
        int N = a.length;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Level1.MadMax(N, a)));
        System.out.println();
        int[] a1 = {1};
        int N1 = a1.length;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(Level1.MadMax(N1, a1)));
    }
}
