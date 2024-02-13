package art.ironcoding.codility.lesson8Leader;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * https://app.codility.com/programmers/lessons/8-leader/dominator/
 * Find an index of an array such that its value occurs at more than half of indices in the array.
 */
public class Dominator {

    public static void main(String[] args) {
        int[] A = {3, 4, 3, 2, -1, 0, 3, 3, 3}; // may return 0, 2, 4, 6 or 7
        //int[] A = {1, 2, 3, 4};
        System.out.println("A = " + Arrays.toString(A));
        System.out.println("One of the index of dominator is: " + solution(A));
    }

    public static int solution(int[] A) {
        HashMap<Integer, Integer> candidates = new HashMap<>();
        for (int a : A) {
            if (!candidates.containsKey(a)) {
                candidates.put(a, 1);
            } else {
                int candidateCounter = candidates.get(a);
                candidates.remove(a);
                candidateCounter++;
                candidates.put(a, candidateCounter);
            }
        }
        System.out.println("candidates = " + candidates);
        //candidates.forEach((k, v) -> System.out.println("k = " + k));
        int dominator = -1;
        int dominatorNumber = A.length / 2;

        for (Integer key : candidates.keySet()) {
            // System.out.println("key = " + key);
            if (candidates.get(key) > dominatorNumber) {
                dominator = key;
            }
        }
        if (dominator == -1) return dominator;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == dominator) {
                return i;
            }
        }

        return -1;
    }

    public static int solutionSimple(int[] A) {
        Arrays.sort(A);
        System.out.println("A sorted = " + Arrays.toString(A));
        return A.length / 2;
    }
}
