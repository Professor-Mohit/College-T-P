package Arrays;

public class Copy_arr_one_elem_another {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Elements of the first array:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Elements of the second array (copied from the first array):");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
