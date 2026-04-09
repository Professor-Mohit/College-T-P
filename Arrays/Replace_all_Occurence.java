package Arrays;

public class Replace_all_Occurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int replacement = 99;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                arr[i] = replacement;
            }
        }

        System.out.println("Array after replacing all occurrences of " + target + " with " + replacement + ":");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}