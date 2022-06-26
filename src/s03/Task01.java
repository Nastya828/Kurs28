package s03;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] a = {4, 1, 44, 255, 7, 43, 8, 11, 9};
        int N = a.length;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Level1.MadMax(N, a)));
        System.out.println();
        int[] a1 = {1, 2, 3, 4, 5, 6, 7 };
        int N1 = a1.length;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(Level1.MadMax(N1, a1)));
//        Ошибка или не пройден тест:
//        MadMax(7,[7,6,5,4,3,2,1])=[1,2,3,7,6,5,4]
        int[] a2 = {7,6,5,4,3,2,1};
        int N2 = a2.length;
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(Level1.MadMax(N2, a2)));
    }
}
