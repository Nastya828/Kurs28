package s10;

import java.util.HashMap;
import java.util.Map;

public class Level1 {

    public static int PrintingCosts(String Line) {
        Map<Character, Integer> map = new HashMap<>();

        map.put(' ', 0);
        map.put('&', 24);
        map.put(',', 7);
        map.put('2', 22);
        map.put('8', 23);
        map.put('>', 10);
        map.put('D', 26);
        map.put('J', 18);
        map.put('P', 23);
        map.put('V', 19);
        map.put('\\', 10);
        map.put('b', 25);
        map.put('h', 21);
        map.put('n', 18);
        map.put('t', 17);
        map.put('z', 19);

        map.put('!', 9);
        map.put('\'', 3);
        map.put('-', 7);
        map.put('3', 23);
        map.put('9', 26);
        map.put('?', 15);
        map.put('E', 26);
        map.put('K', 21);
        map.put('Q', 31);
        map.put('W', 26);
        map.put(']', 18);
        map.put('c', 17);
        map.put('i', 15);
        map.put('o', 20);
        map.put('u', 17);
        map.put('{', 18);

        map.put('"', 6);
        map.put('(', 12);
        map.put('.', 4);
        map.put('4', 21);
        map.put(':', 8);
        map.put('@', 32);
        map.put('F', 20);
        map.put('L', 16);
        map.put('R', 28);
        map.put('X', 18);
        map.put('^', 7);
        map.put('d', 25);
        map.put('j', 20);
        map.put('p', 25);
        map.put('v', 13);
        map.put('|', 12);

        map.put('#', 24);
        map.put(')', 12);
        map.put('/', 10);
        map.put('5', 27);
        map.put(';', 11);
        map.put('A', 24);
        map.put('G', 25);
        map.put('M', 28);
        map.put('S', 25);
        map.put('Y', 14);
        map.put('_', 8);
        map.put('e', 23);
        map.put('k', 21);
        map.put('q', 25);
        map.put('w', 19);
        map.put('}', 18);

        map.put('$', 29);
        map.put('*', 17);
        map.put('0', 22);
        map.put('6', 26);
        map.put('<', 10);
        map.put('B', 29);
        map.put('H', 25);
        map.put('N', 25);
        map.put('T', 16);
        map.put('Z', 22);
        map.put('`', 3);
        map.put('f', 18);
        map.put('l', 16);
        map.put('r', 13);
        map.put('x', 13);
        map.put('~', 9);

        map.put('%', 22);
        map.put('+', 13);
        map.put('1', 19);
        map.put('7', 16);
        map.put('=', 14);
        map.put('C', 20);
        map.put('I', 18);
        map.put('O', 26);
        map.put('U', 23);
        map.put('[', 18);
        map.put('a', 23);
        map.put('g', 30);
        map.put('m', 22);
        map.put('s', 21);
        map.put('y', 24);

        int result = 0;

        for (char c : Line.toCharArray()) {
            result += map.getOrDefault(c, 23);
        }
        return result;
    }
}
