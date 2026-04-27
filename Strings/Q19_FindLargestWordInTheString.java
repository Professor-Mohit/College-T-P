package Strings;

import java.util.Scanner;

public class Q19_FindLargestWordInTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        String[] str = s.split(" ") ;
        int max = Integer.MIN_VALUE ;
        int idx = 0 ;
        for (int i = 0 ; i < str.length ; i++) {
            int length = str[i].length() ;
            if (length > max) {
                max = length ;
                idx = i ;
            }
        }
        System.out.println("Largest Word is : " + str[idx] ) ;
        System.out.println("The length of the word is : " + max);
    }
}
