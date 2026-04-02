package Arrays;

public class count_occerence_Specidic_elem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 3};
        int target = 3;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
            
        }
        System.out.println("Element " + target + " occurs " + count + " times in the array.");
    }
}
