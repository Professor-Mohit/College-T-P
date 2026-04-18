package Arrays;

public class Missing_Number {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int n = 5;

        int totalSum = n * (n + 1) / 2;

        int arrSum = 0;
        for (int x : arr) {
            arrSum += x;
        }

        int missing = totalSum - arrSum;

        System.out.println("Missing number: " + missing);
    }
}