package Arrays;

public class PairSum_equals_givenNum {
   public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int targetSum = 5;

        boolean pairExists = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    pairExists = true;
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + targetSum);
                }
            }
        }

        if (!pairExists) {
            System.out.println("No pair found that sums to " + targetSum);
        }
   } 
}
