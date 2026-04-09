package Arrays;

public class last_occurence {
    public static void main(String[] args) {
        int[] arr = {1, 45, 3, 4, 5, 2, 3};
        int target = 3;
        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The last occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
