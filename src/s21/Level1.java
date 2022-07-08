package s21;


import java.util.*;

public class Level1 {

    public static String BiggerGreater(String input) {
        Queue<String> stringQueue = new LinkedList<>();
        Set<String> set = new TreeSet<>();
        stringQueue.add(input);

        while (!stringQueue.isEmpty()) {
            String str = stringQueue.poll();

            if(!set.contains(str)) {
                System.out.println(str + " add");
                set.add(str);
                for (int i = 0; i < str.length(); i++) {
                    String c = String.valueOf(str.charAt(i));
                    stringQueue.add(str.substring(i + 1) + c + str.substring(0, i));
                }
            }
        }

        for(String s:set){
            System.out.print(s + " ");
            System.out.println(s.compareTo(input));
            if(s.compareTo(input) > 0){
                return s;
            }
        }
        return "";
    }


}
