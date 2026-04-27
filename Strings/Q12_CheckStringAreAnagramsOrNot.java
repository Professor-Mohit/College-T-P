package Strings;

import java.util.Scanner;

public class Q12_CheckStringAreAnagramsOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s1 = sc.next();
        String s2 = sc.next();
        int[] hash1 = new int[26] ;
        int[] hash2 = new int[26] ;
        for (int i = 0 ; i < s1.length() ; i++) {
            char ch = s1.charAt(i) ;
            hash1[ch-'a']++ ;
        }
        for (int i = 0 ; i < s2.length() ; i++) {
            char ch = s2.charAt(i) ;
            hash2[ch-'a']++ ;
        }
        boolean ans = true ;
        for (int i = 0 ; i < hash1.length ; i++) {
            if (hash1[i] != hash2[i]) {
                ans = false ;
                break ;
            }
        }
        System.out.println(ans ? "Anagram" : "Not Anagram");
    }
}
