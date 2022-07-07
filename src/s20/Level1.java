package s20;

import java.util.ArrayList;
import java.util.List;


public class Level1 {
    static List<String> listStrings = new ArrayList<>();
    static StringBuilder result = new StringBuilder();
    static int counter = 0;
    static boolean flag = false;


    public static StringBuilder add(String command) {
        for (int i = 2; i < command.length(); i++) {
            result.append(command.charAt(i));
        }
        return result;
    }

    public static StringBuilder delete(int d) {
        if (d <= result.length()) {
            result.delete(result.length() - d, result.length());
        } else {
            result.delete(0, result.length());
        }
        return result;
    }

    public static String BastShoe(String command) {

        String[] strings = command.split(" ");
        int x = Integer.parseInt(strings[0]);

        if (x == 1) {
            check();
            add(command);
            listStrings.add(result.toString());

        } else if (x == 2) {
            check();
            int d = Integer.parseInt(strings[1]);
            delete(d);
            listStrings.add(result.toString());
        } else if (x == 3) {
            int d = Integer.parseInt(strings[1]);
            if (d < result.length()) {
                return String.valueOf(result.charAt(d));
            } else {
                return "";
            }
        } else if (x == 4) {
            flag = true;
            counter++;
            if (counter < listStrings.size() && !listStrings.isEmpty()) {
                result = new StringBuilder(Undo(counter));
            }
        } else if (x == 5) {
            if (counter > 0 && !listStrings.isEmpty()) {
                counter--;
                result = new StringBuilder(Redo(counter));
            }
        }
        return result.toString();
    }


    public static String Undo(int c) {
        return listStrings.get(listStrings.size() - c - 1);

    }

    public static String Redo(int c) {
        return listStrings.get(listStrings.size() - c - 1);
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
