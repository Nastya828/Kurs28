package s04;

import java.util.HashMap;
import java.util.Map;

public class Level1 {

    public static int[] sortAsc(int[] a) {
        boolean flagAsc = false;
        while (!flagAsc) {
            flagAsc = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] >= a[i + 1]) {
                    flagAsc = false;
                    a[i] = a[i + 1] + a[i];
                    a[i + 1] = a[i] - a[i + 1];
                    a[i] = a[i] - a[i + 1];
                }
            }
        }
        return a;
    }

    public static int[] SynchronizingTables(int N, int[] ids, int[] salary) {

        int[] idsCopy = new int[ids.length];

        for (int i = 0; i < ids.length; i++) {
            idsCopy[i] = ids[i];
        }
        sortAsc(idsCopy);
        sortAsc(salary);
        Map<Integer, Integer> map = new HashMap<>(idsCopy.length);
        for (int i = 0; i < N; i++) {
            map.put(idsCopy[i], salary[i]);
        }
        for (int i = 0; i < ids.length; i++) {
            if (map.containsKey(ids[i])) {
                salary[i] = map.getOrDefault(ids[i], -1);
            }
        }
        return salary;
    }
}
