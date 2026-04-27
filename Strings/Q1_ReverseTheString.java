package Strings;

import java.util.*;

public class Q1_ReverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.next();
        char[] ch = s.toCharArray() ;
        int i = 0 ;
        int j = ch.length -1;
        while(i < j) {
            char temp = ch[i] ;
            ch[i] = ch[j] ;
            ch[j] = temp ;
            i++ ;
            j-- ;
        }
        StringBuilder sb = new StringBuilder() ;
        for (int k = 0 ; k < ch.length ;k++) sb.append(ch[k]) ;
        System.out.println(sb.toString());
    }

}
