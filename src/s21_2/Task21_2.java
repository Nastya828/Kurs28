package s21_2;

import java.util.Arrays;

public class Task21_2 {


    public static void main(String[] args) {
        //MatrixTurn(["123456", "234567", "345678", "456789"], 4,6, 3)
        String[] Matrix = {"123456", "234567", "345678", "456789"};
        System.out.println(Arrays.toString(Matrix));
        Level1.MatrixTurn(Matrix, 4,6, 1);
        System.out.println(Arrays.toString(Matrix));

       // String[] Matrix ={"123456", "218911", "321222", "433433", "545644", "657855", "789016"};
//        int M = 7; //строк
//        int N = 6; //столбцов
//        int T = 3; //шаги
//        System.out.println(Arrays.toString(Matrix));
//        Level1.MatrixTurn(Matrix, M, N, T);
//        System.out.println(Arrays.toString(Matrix));



    }
}
