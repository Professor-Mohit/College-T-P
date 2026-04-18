public class Kadanes_algo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i < arr.length; i++) {
            max_ending_here += arr[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }

        System.out.println("Maximum subarray sum is: " + max_so_far);
    }
}
