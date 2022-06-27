package s04;


import java.util.Arrays;

public class TaskMain {
    public static void main(String[] args) {
        int[] ids = {50, 1, 1024};
        int[] salary = {20000, 100000, 90000};
        int N = ids.length;

        System.out.println("main: " + Arrays.toString(Level1.SynchronizingTables(N, ids, salary)));
    }

}
