package s19;

import java.util.*;

public class Level1 {

    public static String[] sort(Map<String, Integer> map) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            int value = e.getValue();
            boolean flag = false;
            for (int i = 0; i < integers.size(); i++) {
                if (value > integers.get(i)) {
                    integers.add(i, value);
                    strings.add(i, e.getKey());
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                integers.add(value);
                strings.add(e.getKey());
            }
        }

        String[] s = new String[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            s[i] = strings.get(i) + " " + integers.get(i).toString();
        }
        return s;
    }

    public static String[] ShopOLAP(int N, String[] items) {
        if (N <= 1) {
            return items;
        }

        String[] strings = new String[items.length * 2];
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0, k = 0; i < items.length && k < strings.length - 1; i++, k += 2) {
            strings[k] = items[i].split(" ")[0];
            strings[k + 1] = items[i].split(" ")[1];
        }

        map.put(strings[0], Integer.valueOf(strings[1]));
        for (int i = 2; i < strings.length - 1; i += 2) {
            if (map.containsKey(strings[i])) {
                map.replace(strings[i], (map.get(strings[i]) + Integer.parseInt(strings[i + 1])));
            } else {
                map.put(strings[i], Integer.parseInt(strings[i + 1]));
            }
        }
        return sort(map);
    }
}
