package Arrays;

public class Diffrence_btw_largest_smallest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        int difference = largest - smallest;
        System.out.println("Difference between largest and smallest: " + difference);
    }
}
