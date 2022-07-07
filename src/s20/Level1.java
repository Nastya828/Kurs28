package s20;

import java.util.ArrayList;
import java.util.List;


public class Level1 {
    static List<String> listStrings = new ArrayList<>();
    static StringBuilder result = new StringBuilder();
    static int counter = 0;
    static boolean flag = false;


    public static void add(String command) {
        for (int i = 2; i < command.length(); i++) {
            result.append(command.charAt(i));
        }
        listStrings.add(result.toString());
    }

    public static void delete(int d) {
        if (d <= result.length()) {
            result.delete(result.length() - d, result.length());
        } else {
            result.delete(0, result.length());
        }
        listStrings.add(result.toString());
    }

    public static String BastShoe(String command) {

        String[] strings = command.split(" ");
        int x = Integer.parseInt(strings[0]);

        if (x == 1) {
            check();
            add(command);
        } else if (x == 2) {
            check();
            int d = Integer.parseInt(strings[1]);
            delete(d);
        } else if (x == 3) {
            int d = Integer.parseInt(strings[1]);
            return pointer(d);
        } else if (x == 4 && counter < listStrings.size() - 1 && !listStrings.isEmpty()) {
            flag = true;
            counter++;
            Undo(counter);
        } else if (x == 5 && counter > 0 && !listStrings.isEmpty()) {
            counter--;
            Redo(counter);
        }
        return result.toString();
    }


    public static void Undo(int c) {
        result = new StringBuilder(listStrings.get(listStrings.size() - c - 1));
    }

    public static void Redo(int c) {
        result = new StringBuilder(listStrings.get(listStrings.size() - c - 1));
    }

    public static String pointer(int d) {
        if (d < result.length()) {
            return String.valueOf(result.charAt(d));
        } else {
            return "";
        }
    }

    public static void check() {
        if (flag) {
            listStrings.clear();
            flag = false;
            counter = 0;
            listStrings.add(result.toString());
        }
    }
}
