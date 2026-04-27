package Strings;

import java.util.Scanner;

public class Q6_FindTheASCIIValueOfEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.next() ;
        for (int i = 0 ; i < s.length() ;i++) {
            char ch = s.charAt(i) ;
            System.out.println(ch + " ASCII Value is : " + (int)(ch));
        }
    }
}
