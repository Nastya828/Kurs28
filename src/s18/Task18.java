package s18;


public class Task18 {

    public static void main(String[] args) {
        int[] data = {1, 3, 4, 5, 6, 2, 7, 9, 10, 8, 11};
        int N = 11;
        System.out.println(Level1.MisterRobot(N, data));

        int[] data2 = {1, 3, 4, 5, 6, 2, 7};
        int N2 = 7;
        System.out.println(Level1.MisterRobot(N2, data2));

        int[] data3 = {1, 3, 4, 5, 6, 2, 7, 13, 15, 11, 10, 8, 9, 14, 12};
        int N3 = 15;
        System.out.println(Level1.MisterRobot(N3, data3));
    }
}
