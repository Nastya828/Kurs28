package s24;

public class Task24 {

    public static void main(String[] args) {

        System.out.println(Level1.Football(new int[]{1, 3, 2}, 3));

        System.out.println(Level1.Football(new int[]{3, 2, 1}, 3));

        int[] x = {4, 3, 2, 1, 5};
        System.out.println(Level1.Football(x, x.length));

        int[] x1 = {1, 4, 3, 2, 5};
        System.out.println(Level1.Football(x1, x1.length));

        int[] x2 = {1, 7, 5, 3, 9};
        System.out.println(Level1.Football(x2, x2.length));

        int[] x3 = {1, 2, 3};
        System.out.println(Level1.Football(x3, x3.length));

    }
}
