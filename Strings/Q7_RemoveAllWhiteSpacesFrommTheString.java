package Strings;

import java.util.Scanner;

public class Q7_RemoveAllWhiteSpacesFrommTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        StringBuilder sb = new StringBuilder() ;
        for (int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i) ;
            if (ch != ' ') sb.append(ch) ;
        }
        System.out.println(sb.toString());
    }
}
