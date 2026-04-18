package String;

// Problem 7: remove all the vowels in the string.
public class Problem7 {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                  c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                result.append(c);
            }
        }

        System.out.println("String after removing vowels: " + result.toString());   
    }
}