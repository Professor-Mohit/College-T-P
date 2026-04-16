package Arrays;

public class replace_Negative_zero {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, -5 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        System.out.println("Array after replacing negative numbers with zero:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}