package Strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Q37_LexicographicallySmallestLargestSubstring {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int k = 2;
        ArrayList<String> ans = new ArrayList<>();
        for (int i=0; i<=s.length()-k; i++) {
            ans.add(s.substring(i,i+k));
        }
        Collections.sort(ans);
        System.out.println("Lexicographically smallest -> " + ans.getFirst());
        System.out.println("Lexicographically largest -> " + ans.getLast());
    }
}
