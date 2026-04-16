package Arrays;

public class Reverse_Array {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // print result
        System.out.print("Reversed array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}