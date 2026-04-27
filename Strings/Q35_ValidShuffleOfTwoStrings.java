package Strings;

import java.util.HashMap;

public class Q35_ValidShuffleOfTwoStrings {
    public static void main(String[] args) {
        String s1 = "abs";
        String s2 = "nde";
        String shuffle = "bdene";
        boolean ans = true;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()) map.put(ch, map.getOrDefault(ch,0)+1);
        for (char ch : s2.toCharArray()) map.put(ch, map.getOrDefault(ch, 0)+1);
        for (char ch : shuffle.toCharArray()) {
            if (map.containsKey(ch)) {
                if (map.get(ch) == 0) {
                    ans = false;
                    break;
                }
                map.put(ch, map.get(ch)-1);
            }
            else {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
