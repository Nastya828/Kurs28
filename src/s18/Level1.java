package s18;


public class Level1 {

    public static void function(int x, int[] data) {
        long timeStart = System.currentTimeMillis();
        int t, y, e;
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = data[i + x];
        }

        boolean flag = false;
        while (!flag && (System.currentTimeMillis() - timeStart) < 500) {
            flag = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    flag = false;
                    t = a[0];
                    e = a[1];
                    y = a[2];
                    a[0] = y;
                    a[1] = t;
                    a[2] = e;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            data[i + x] = a[i];
        }
    }

    public static boolean MisterRobot(int N, int[] data) {
       long timeStart = System.currentTimeMillis();
        boolean flag = false;
        while (!flag && (System.currentTimeMillis()-timeStart) < 500) {
            flag = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    flag = false;
                    if(i == 0){
                        function(i, data);
                    }else {
                        function(i - 1, data);
                    }
                }
            }
        }
        return flag;
    }
}


