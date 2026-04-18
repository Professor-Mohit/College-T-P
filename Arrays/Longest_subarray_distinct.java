package Arrays;

public class Longest_subarray_distinct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6};

        int max_length = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            for (int i = start; i < end; i++) {
                if (arr[i] == arr[end]) {
                    start = i + 1;
                    break;
                }
            }
            max_length = Math.max(max_length, end - start + 1);
        }

        System.out.println("Length of the longest subarray with distinct elements: " + max_length);
    }
}
