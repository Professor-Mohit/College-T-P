package Arrays;

public class Merge_two_array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 2, 8, 9, 10};
        int[] mergedArr = new int[arr1.length + arr2.length];

        // first array
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        }

        // second array
        for (int i = 0; i < arr2.length; i++) {
            mergedArr[arr1.length + i] = arr2[i];
        }

        System.out.println("Merged array:");
        for (int num : mergedArr) {
            System.out.print(num + " ");
        }
    }
}
