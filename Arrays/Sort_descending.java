package Arrays;

public class Sort_descending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        // Print result
        System.out.print("Sorted array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
