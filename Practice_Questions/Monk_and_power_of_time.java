import java.util.Scanner;

public class Monk_and_power_of_time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] % k == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
    
}
