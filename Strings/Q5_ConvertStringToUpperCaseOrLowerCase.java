package Strings;

import java.util.Scanner;

public class Q5_ConvertStringToUpperCaseOrLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.next() ;
        StringBuilder sb = new StringBuilder() ;
        for (int i = 0 ; i < s.length() ;i++) {
            char ch = s.charAt(i) ;
            if (ch >= 90) {
                int n = (int)(ch) ;
                char ch1 = (char) (n - 32);
                sb.append(ch1) ;
            }
            else sb.append(ch) ;
        }
        System.out.println("All String in UpperCase is : " + sb.toString());

        sb.delete(0,sb.length()) ;
        for (int  i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i) ;
            if (ch <= 90) {
                int n = (int)(ch) ;
                char ch1 = (char)(n + 32) ;
                sb.append(ch1);
            } else sb.append(ch) ;
        }
        System.out.println("All String in LowerCase is : " + sb.toString());
    }
}
