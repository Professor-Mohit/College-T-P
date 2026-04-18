package Arrays;
import java.util.*;


public class Find_duplicates {
    public static void main(String[] args) {

        int[] arr = {1,2,3,1,3,6,6};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int x : arr) {
            if (!seen.add(x)) {
                duplicates.add(x);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}