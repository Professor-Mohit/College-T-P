package Strings;

import java.util.Scanner;

public class Q17_SwapUpperToLowerAndLowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.next() ;
        StringBuilder sb = new StringBuilder() ;
        for (int i = 0 ; i < s.length() ;i++) {
            char ch = s.charAt(i) ;
            int num = (int)(ch) ;
            if (ch >=65 && ch <= 90) {
                num = num + 32 ;
                char c = (char)(num) ;
                sb.append(c) ;
            }else{
                num = num - 32 ;
                char c = (char)(num) ;
                sb.append(c) ;
            }
        }

        System.out.println(sb.toString());
    }
}
