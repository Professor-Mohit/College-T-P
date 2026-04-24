package String;

// Reverse a string without using built-in reverse function.
public class Program2 {
    public static void main(String[] args) {
        String str = "World";
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        System.out.println("Reversed string: " + reversed.toString());
    }
}