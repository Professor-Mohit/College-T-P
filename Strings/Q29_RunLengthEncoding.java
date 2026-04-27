package Strings;

public class Q29_RunLengthEncoding {
    public static void main(String[] args) {
        String s = "aabbccgg";
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i<n) {
            char ch = s.charAt(i);
            ans.append(ch);
            int cnt = 1;
            while (i+1<n && s.charAt(i+1) == ch) {
                i++;
                cnt++;
            }
            ans.append(cnt);
            i++;
        }
        System.out.println(ans);
    }
}
