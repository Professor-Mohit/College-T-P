package Strings;
import java.util.*;
public class Q30_LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "dvdf";
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int i=0, j=0, ans=0;;
        while (j<n) {
            char ch = s.charAt(j);
            if (set.contains(ch)) {
                ans = Math.max(ans,j-i);
                while (i<n && s.charAt(i) != ch) {
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
            else {
                set.add(ch);
                j++;
            }
            ans = Math.max(ans, j-i);
        }
        System.out.println(ans);
    }
}
