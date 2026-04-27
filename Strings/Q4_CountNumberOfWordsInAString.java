package Strings;

import java.util.Scanner;

public class Q4_CountNumberOfWordsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.next();
        int cnt = 0 ;
        for (int i = 0 ; i < s.length() ;i++) {
            cnt++ ;
        }

        System.out.println(cnt);
    }
}
