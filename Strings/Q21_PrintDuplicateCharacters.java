package Strings;

import java.util.HashMap;

public class Q21_PrintDuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " -> " + map.get(key));
            }
        }
    }
}
