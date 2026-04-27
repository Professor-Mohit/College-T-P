package Strings;

import java.util.Scanner;

public class Q3_CountTheVowelsAndConsonantsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.next();
        int vowels = 0 ;
        int consonants = 0 ;
        for (int i = 0 ; i < s.length() ;i++) {
            char ch = s.charAt(i) ;
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
                vowels++ ;
            } else if ((ch >= 65 && ch <= 90 )|| (ch >= 97 && ch <= 122)) consonants++ ;
        }
        System.out.println("Vowels is : " + vowels);
        System.out.println("Consonants is : " + consonants);
    }
}
