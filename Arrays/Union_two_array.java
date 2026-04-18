import java.util.*;

public class Union_Array {
    public static void main(String[] args) {

        int[] A = {1, 2, 2, 3};
        int[] B = {2, 4, 5};

        Set<Integer> set = new HashSet<>();

        // add elements of A
        for (int x : A) {
            set.add(x);
        }

        // add elements of B
        for (int x : B) {
            set.add(x);
        }

        System.out.println("Union: " + set);
    }
}