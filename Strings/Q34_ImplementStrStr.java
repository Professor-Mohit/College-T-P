package Strings;

public class Q34_ImplementStrStr {
    public static void main(String[] args) {
        String s1 = "adbutsad" ;
        String s2 = "sad" ;
        int idx = -1;
        for (int i=0; i<s1.length(); i++) {
            int cnt = 0;
            int x = i, y = 0;
            while (x<s1.length() && y<s2.length() && s1.charAt(x) == s2.charAt(y)) {
                cnt++;
                x++;
                y++;
            }
            if (cnt == s2.length()) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}
