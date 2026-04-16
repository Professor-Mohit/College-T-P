package Arrays;

public class sum_even_odd {
    public static void main(String[] args) {
        int[] arr = { 10, 4, 3, 50, 23, 90 };
        int n = arr.length;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
