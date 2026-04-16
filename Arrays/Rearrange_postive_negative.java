package Arrays;

public class Rearrange_postive_negative {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};
        rearrangePositiveNegative(arr);
        System.out.println("Array after rearranging positive and negative numbers:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rearrangePositiveNegative(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left pointer to the right until a negative number is found
            while (left < right && arr[left] >= 0) {
                left++;
            }

            // Move right pointer to the left until a positive number is found
            while (left < right && arr[right] < 0) {
                right--;
            }

            // Swap the negative number at left with the positive number at right
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
