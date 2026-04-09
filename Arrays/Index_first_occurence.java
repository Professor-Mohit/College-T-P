package Arrays;

public class Index_first_occurence {
    public static void main(String[] args) {
        int[] arr = {1, 45, 3, 4, 5, 2};
        int target = 3;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The first occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
