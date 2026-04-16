package Arrays;

public class Array_sorted_Ascending {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        boolean isSortedAscending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSortedAscending = false;
                break;
            }
        }

        if (isSortedAscending) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }
}
