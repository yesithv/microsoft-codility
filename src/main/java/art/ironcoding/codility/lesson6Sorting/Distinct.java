package art.ironcoding.codility.lesson6Sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://app.codility.com/programmers/lessons/6-sorting/distinct/
 * Compute number of distinct values in an array.
 */
public class Distinct {

    public static void main(String[] args) {
        int A[] = {2, 1, 1, 2, 3, 1}; // return 3
        System.out.println("A[] = " + Arrays.toString((A)));
        System.out.println("Distinct values are: " + solution(A));
    }

    public static int solution(int A[]) {
        // Traverse all the array
        Set<Integer> distinct = new HashSet<>();
        for (int a : A) {
            // Put all elements in a Set
            distinct.add(a);
        }

        // count set
        return distinct.size();

    }
}
