package Arrays;

public class Check_if_Array_contains {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5};
        int target = 3;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The array contains the target element: " + target);
        } else {
            System.out.println("The array does not contain the target element: " + target);
        }
    }
}
