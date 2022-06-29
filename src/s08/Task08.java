package s08;

public class Task08 {
    public static void main(String[] args) {
        int[] array1 = {2, -1, 3};
        int N = array1.length;
        int result = Level1.SumOfThe(N, array1);
        System.out.println(result);

        int[] array2 = {100, -50, 10, -25, 90, -35, 90};
        int N2 = array2.length;
        System.out.println(Level1.SumOfThe(N2, array2));
    }
}
