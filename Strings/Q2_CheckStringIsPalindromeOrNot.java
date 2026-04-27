package Strings;

import java.util.Scanner;

public class Q2_CheckStringIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.next();
        int i = 0 ;
        int j = s.length()-1;
        boolean ans = true ;
        while( i < j ) {
            char ch = s.charAt(i) ;
            char ch1 = s.charAt(j) ;
            if (ch != ch1) {
                ans = false ;
                break ;
            }
            i++;
            j--;
        }
        System.out.println(ans);
    }
}
