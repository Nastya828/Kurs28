package s11;

public class Level1 {

    public static String BigMinus(String s1, String s2) {
        long x = Long.parseLong(s1);
        long y = Long.parseLong(s2);
        long minus = x - y;
        return String.valueOf(Math.abs(minus));
    }
}
