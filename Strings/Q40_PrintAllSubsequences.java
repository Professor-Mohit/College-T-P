package Strings;

public class Q40_PrintAllSubsequences {
    public static void printSubsequence(String str, int index, String ans) {
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }

        printSubsequence(str, index + 1, ans + str.charAt(index));

        printSubsequence(str, index + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsequence(str, 0, "");
    }
}
