package Arrays;

// Intersection_two_arr.java

import java.util.*;

public class Intersection_two_arr {
    public static void main(String[] args) {

        int[] A = {1, 2, 2, 3};
        int[] B = {2, 2, 4};

        Set<Integer> setA = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int x : A) setA.add(x);

        for (int x : B) {
            if (setA.contains(x)) {
                result.add(x);
            }
        }

        System.out.println(result);
    }
}