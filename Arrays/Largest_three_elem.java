package Arrays;

public class Largest_three_elem {
    public static void main(String[] args) {
        int[] arr = { 10, 4, 3, 50, 23, 90 };
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
        }

        System.out.println("The three largest elements are: " + first + ", " + second + ", " + third);
    }
}   
