package Arrays;

public class Seperate_even_odd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenArr = new int[arr.length];
        int[] oddArr = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenArr[evenIndex++] = num;
            } else {
                oddArr[oddIndex++] = num;
            }
        }

        System.out.println("Even elements in the array:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println();

        System.out.println("Odd elements in the array:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArr[i] + " ");
        }
    }
}
