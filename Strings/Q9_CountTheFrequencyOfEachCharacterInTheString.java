package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q9_CountTheFrequencyOfEachCharacterInTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.next() ;
//        int[] hash = new int[256] ;
//        for (int i = 0 ; i < s.length() ;i++) {
//            char ch = s.charAt(i) ;
//            hash[ch]++ ;
//        }
//        for (int i = 0 ; i < hash.length ;i++) {
//            char ch = (char)(i) ;
//            if (hash[i] > 0 ) System.out.println(ch + " appears " + hash[i]);
//        }


        // HashMap -> Does not maintain any order.
        // LinkedHashMap -> It maintain the insertion order.
        // TreeMap -> It provide answer in sorting order.
        Map<Character , Integer> mpp = new HashMap<>() ;
        for (int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i) ;
            mpp.put(ch , mpp.getOrDefault(ch,0)+1) ;
        }
        for (Map.Entry<Character, Integer> entry : mpp.entrySet()) {
            char key = entry.getKey();
            int value  = entry.getValue();
            System.out.println(key + " appears " + value);
        }
    }
}






















