package Arrays;

public class Count_subarray_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target_sum = 5;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target_sum) {
                    count++;
                }
            }
        }

        System.out.println("Count of subarrays with sum " + target_sum + " is: " + count);
    }
}
