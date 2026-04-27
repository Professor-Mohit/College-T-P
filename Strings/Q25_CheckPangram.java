package Strings;

public class Q25_CheckPangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toLowerCase();

        boolean[] visited = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                visited[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;

        for (int i = 0; i < 26; i++) {
            if (!visited[i]) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
