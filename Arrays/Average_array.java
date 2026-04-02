package Arrays;

public class Average_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int average = sum / n;
        System.out.println("The average of the elements in the array is: " + average);
    }
}
