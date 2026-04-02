import java.util.Scanner;

class itsmagic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

        }
        int min = arr[0];
        int result = 0;
        for (int j = 0; j < len; j++) {
            if ((sum - arr[j]) % 7 == 0 && min > arr[j]) {
                min = arr[j];
                result = j;
            }

        }
        System.out.println(result);
    }

}