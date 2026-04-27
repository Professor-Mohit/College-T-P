package Strings;

import java.util.*;

public class Q14_RemoveDuplicateCharacterFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.next() ;
        LinkedHashSet<Character> set = new LinkedHashSet<>() ;
        for (int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i) ;
            set.add(ch) ;
        }
        for (char ch : set) {
            System.out.print(ch);
        }
    }
}
