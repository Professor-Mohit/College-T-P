package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q11_FindTheFirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character , Integer> map = new HashMap<>() ;
        for (int i = 0 ; i < s.length() ;i++) {
            char ch = s.charAt(i) ;
            map.put(ch , map.getOrDefault(ch,0)+1) ;
        }
        for (Map.Entry<Character , Integer> entry : map.entrySet() ) {
            char ch = entry.getKey() ;
            int val = entry.getValue();
            if (val > 1) {
                System.out.println("First Repeating Character is : " + ch);
                break ;
            }
        }
    }
}
