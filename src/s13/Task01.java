package s13;


import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {

        int[] x = {1234, 1777};

        System.out.println("Шестнадцать: 4660,6007");
        System.out.println(Arrays.toString(Level1.UFO(x.length, x, false)));

        System.out.println("Восемь: 668,1023");
        System.out.println(Arrays.toString(Level1.UFO(x.length, x, true)));

    }
}
