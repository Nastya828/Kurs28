package s05;

public class Task06 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 2, 7, 8, 9};
        int N = array.length;
        String result = Level1.PatternUnlock(N, array);
        System.out.println("result = " + result);
        int[] array2 = {1};
        int N2 = array2.length;
        String result2 = Level1.PatternUnlock(N2, array2);
        System.out.println("result = " + result2);
    }
}
