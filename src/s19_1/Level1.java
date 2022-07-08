package s19_1;

public class Level1 {

    public static char[] swap(char[] chars, int i, int j) {
        char buf;
        buf = chars[i];
        chars[i] = chars[j];
        chars[j] = buf;
        return chars;
    }

    public static String BiggerGreater(String input) {

        char[] chars = input.toCharArray();
        boolean flag = false;

        int index = -1;
        for (int i = input.length() - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (input.charAt(i) > input.charAt(j)) {
                    flag = true;
                    index = j;
                    swap(chars, i, j);
                    break;
                }
            }
            if (flag) {
                break;
            }

        }
        boolean sortIs = false;
        while (!sortIs) {
            sortIs = true;
            for (int i = index + 1; i < chars.length - 1; i++) {
                if (chars[i] > chars[i + 1]) {
                    sortIs = false;
                    swap(chars, i, i + 1);
                }
            }
        }
        String result = String.valueOf(chars);

        if (input.compareTo(result) == 0 || input.compareTo(result) > 0) {
            return "";
        } else {
            return result;
        }
    }


}


