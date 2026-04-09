package Arrays;

public class shift_left {

    static void leftShift(int[] arr) {
        int n = arr.length;
        int first = arr[0];                 

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];            
        }

        arr[n - 1] = first;               
        }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Before: ");
        for (int x : arr) System.out.print(x + " ");

        leftShift(arr);

        System.out.print("\nAfter:  ");
        for (int x : arr) System.out.print(x + " ");
    }
}