package Strings;

import java.util.Scanner;

public class Q15_CheckStringContainsOnlyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.next() ;
        boolean ans = true ;
        for (int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i) ;
            if (ch >= 48 && ch <= 57) continue;
            else {
                ans = false ;
                break ;
            }
        }
        System.out.println(ans ? "Digit Contains" : "Not Digit Contains");
    }
}
