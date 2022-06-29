package s07;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //String s = "строк ннн";
        String s = "1) строка разбивается на набор строк через выравнивание по заданной ширине.";
        int len = 12;
        String subs = "строк";
        int[] result = Level1.WordSearch(len, s , subs);
        System.out.println(Arrays.toString(result));

    }
}
