package s20_1;

import java.util.*;

public class Level1 {

    public static boolean SherlockValidString(String s) {

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (!map.containsKey(aChar)) {
                map.put(aChar, 1);
            } else {
                map.replace(aChar, map.get(aChar) + 1);
            }
        }

        Map<Integer, Integer> mapFrequently = new TreeMap<>();

        for (int i : map.values()) {
            if (!mapFrequently.containsKey(i)) {
                mapFrequently.put(i, 1);
            } else {
                mapFrequently.replace(i, mapFrequently.get(i) + 1);
            }
        }

        if (mapFrequently.size() > 2) {
            return false;
        } else if (mapFrequently.size() == 1) {
            return true;
        }
        int[] res = new int[mapFrequently.size() * 2];
        int i = 0;
        for (Map.Entry<Integer, Integer> m : mapFrequently.entrySet()) {
            res[i] = m.getKey();
            res[i + 1] = m.getValue();
            i += 2;
        }

        return (res[1] > res[3] && res[3] == 1 && ((res[2] == 1) || (res[2] - res[0] == 1))) ||
                (res[1] < res[3] && res[1] == 1 && ((res[0] == 1) || (res[0] - res[2] == 1)));
    }

}
