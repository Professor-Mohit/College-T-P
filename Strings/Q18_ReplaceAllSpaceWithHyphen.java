package Strings;

import java.util.Scanner;

public class Q18_ReplaceAllSpaceWithHyphen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        StringBuilder sb = new StringBuilder() ;
        for (int i = 0 ; i < s.length() ;i++) {
            char ch = s.charAt(i) ;
            if (ch == ' ') sb.append('-') ;
            else sb.append(ch) ;
        }
        System.out.println(sb.toString());
    }
}
