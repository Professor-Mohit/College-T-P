package Strings;

public class Q39_AllPermutationsOfString {
    public static void findPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String leftPart = str.substring(0, i);
            String rightPart = str.substring(i + 1);

            String remaining = leftPart + rightPart;

            findPermutations(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        findPermutations(str, "");
    }
}
