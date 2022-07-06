package s19;

import java.util.Arrays;

public class Task19 {

    public static void main(String[] args) {

        String[] s = {"платье 6", "платье1 5", "сумка122 2", "платье1 1", "сумкая23 2", "сумка128 4", "сумка1 2", "сумка129 4"};
        String[] str = Level1.ShopOLAP(s.length, s);
        System.out.println("result = " + Arrays.toString(str));


        String[] s1 = {"1 3", "2 7", "3 6", "8 7", "8 6"};
        String[] str1 = Level1.ShopOLAP(s1.length, s1);
        System.out.println("result = " + Arrays.toString(str1));
    }
}
