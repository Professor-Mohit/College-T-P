package Strings;

import java.util.*;

public class Q13_CheckTwoStringsRotationOfEachOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s1 = sc.next() ;
        String s2 = sc.next() ;
        String s3 = s1+s1 ;
        if(s3.contains(s2)) {
            System.out.println("Yes");
        }else System.out.println("No");

    }
}
