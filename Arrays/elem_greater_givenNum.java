package Arrays;

public class elem_greater_givenNum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 2};
        int givenNum = 4;

        System.out.println("Elements greater than " + givenNum + ":");
        for (int num : arr) {
            if (num > givenNum) {
                System.out.println(num);
            }
        }
    }
}
