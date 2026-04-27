package Strings;

import java.util.Scanner;

public class Q8_RemoveVowelsFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in ) ;
        String s = "helloworld" ;
        StringBuilder sb = new StringBuilder() ;
        for (int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i) ;
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) continue ;
            else sb.append(ch) ;
        }
        System.out.println(sb.toString());
    }
}


