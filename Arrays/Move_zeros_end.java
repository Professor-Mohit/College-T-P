package Arrays;

public class Move_zeros_end {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 3, 12};
        moveZerosToEnd(arr);
        System.out.println("Array after moving zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0; 
        
        for (int num : arr) {
            if (num != 0) {
                arr[nonZeroIndex++] = num;
            }
        }

        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }
}