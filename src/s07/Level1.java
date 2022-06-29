package s07;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Level1 {

    public static String sep(String s, int len) {

        List<String> stringList = new LinkedList<>(List.of(s.split(" ")));
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() > len) {
                String s1 = stringList.get(i).substring(0, len);
                String s2 = stringList.get(i).substring(len);
                stringList.remove(i);
                stringList.add(i, s1);
                stringList.add(i + 1, s2);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < stringList.size(); i++) {
            stringBuilder.append(stringList.get(i)).append(" ");
            if (i + 1 == stringList.size() || stringBuilder.length() + stringList.get(i + 1).length() > len) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                line.append(stringBuilder).append(System.lineSeparator());
                stringBuilder = new StringBuilder();
            }
        }

        return line.toString();

    }

    public static int[] WordSearch(int len, String s, String subs) {
        String stringBuilder = sep(s, len);
        String[] stepSecond = stringBuilder.split(System.lineSeparator());
        int[] result = new int[stepSecond.length];
        for (int i = 0; i < stepSecond.length; i++) {
            if (Arrays.asList(stepSecond[i].split(" ")).contains(subs)) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }
}
