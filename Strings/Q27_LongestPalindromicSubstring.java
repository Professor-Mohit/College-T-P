package Strings;

import java.util.Scanner;

public class Q27_LongestPalindromicSubstring {

    static boolean isPalindrome(String s) {
        int n = s.length(), i=0, j=n-1;
        while(i<j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "aacabdkacaa";

        int max = 0;
        int n = s.length();
        String ans = "";
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                if (isPalindrome(s.substring(i,j+1))) {
                    int size = j-i+1;
                    if (size>max) {
                        max = size;
                        ans = s.substring(i,j+1);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
