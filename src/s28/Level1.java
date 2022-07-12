package s28;

public class Level1 {

    public static String Keymaker(int k) {

        boolean[] doors = new boolean[k];
        int n = 0;

        while (n < k) {
            n++;
            function(doors, n);
        }
        StringBuilder keyM = new StringBuilder();
        for (boolean b : doors) {
            if (!b) {
                keyM.append(0);
            } else {
                keyM.append(1);
            }
        }
        return keyM.toString();
    }

    public static void function(boolean[] doors, int n) {
        for (int i = n - 1; i < doors.length; i += n) {
            doors[i] = !doors[i];
        }
    }

}
