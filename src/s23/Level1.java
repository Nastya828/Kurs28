package s23;

import java.util.ArrayList;

public class Level1 {

    public static boolean white_walkers(String village) {

        if (village.isEmpty()) {
            return false;
        }

        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();

        for (int i = 0; i < village.length(); i++) {
            if (Character.isDigit(village.charAt(i))) {
                index.add(i);
                number.add(village.charAt(i) - 48);
            }
        }

        if (number.size() < 2) {
            return false;
        }

        for (int i = 0; i < number.size() - 1; i++) {
            if ((number.get(i) + number.get(i + 1)) == 10 && !search(village, index.get(i), index.get(i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static boolean search(String str, int i, int j) {
        int counter = 0;

        char[] chars = str.toCharArray();

        for (int t = i; t <= j; t++) {
            if (chars[t] == '=') {
                counter++;
            }
        }
        return counter == 3;
    }
}
