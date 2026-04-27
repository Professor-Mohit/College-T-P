package Strings;

public class Q33_LongestCommonSubstring {
    public static void main(String[] args) {
        String s1 = "ABCDGH" ;
        String s2 = "ACDGHR" ;
        int n1 = s1.length();
        int n2 = s2.length();
        int ans = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {

                int x = i, y = j, cnt = 0;

                while (x < n1 && y < n2 && s1.charAt(x) == s2.charAt(y)) {
                    cnt++;
                    x++;
                    y++;
                }

                ans = Math.max(ans, cnt);
            }
        }

        System.out.println(ans);
    }
}
