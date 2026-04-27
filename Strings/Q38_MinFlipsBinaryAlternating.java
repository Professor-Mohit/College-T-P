package Strings;

public class Q38_MinFlipsBinaryAlternating {
    public static int minFlips(String s) {
        int flipStartWith0 = 0;
        int flipStartWith1 = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            char expected0 = (i % 2 == 0) ? '0' : '1';
            char expected1 = (i % 2 == 0) ? '1' : '0';

            if (current != expected0) flipStartWith0++;
            if (current != expected1) flipStartWith1++;
        }

        return Math.min(flipStartWith0, flipStartWith1);
    }

    public static void main(String[] args) {
        String s = "0011";

        System.out.println("Minimum flips = " + minFlips(s));
    }
}
