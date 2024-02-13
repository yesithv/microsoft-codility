package art.ironcoding.codility.lesson8Leader;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://app.codility.com/programmers/lessons/8-leader/equi_leader/
 * Find the index S such that the leaders of the sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N - 1] are the same.
 */
public class EquiLeader {

    public static void main(String[] args) {
        int[] A = {4, 3, 4, 4, 4, 2};
        System.out.println("A[] = " + Arrays.toString(A));
        System.out.println("The number of equiLeader are: " + solution(A));
        //searchLeader(A);
    }

    private static int solution(int[] A) {
        int equiLeaders = 0;
        for (int s = 0; s < A.length - 2; s = s + 2) {
            System.out.println("Building subsequences s=" + s);
            System.out.println("A[s=" + s + "] = " + A[s]);
            System.out.println("First subsequence:");
            int firsLeader = 0;
            for (int i = 0; i <= s; i++) {
                System.out.println("A[i=" + i + "] = " + A[i]);
                firsLeader = searchLeader(A);
            }
            System.out.println("Second subsequence: ");
            int secondLeader = 0;
            for (int j = s + 1; j < A.length; j++) {
                System.out.println("A[j=" + j + "] = " + A[j]);
                secondLeader = searchLeader(A);
            }

            if (firsLeader == secondLeader) {
                equiLeaders++;
            }
        }
        return equiLeaders;
    }

    private static int searchLeader(int[] B) {
        HashMap<Integer, Integer> candidates = new HashMap<>();
        // Fill candidates Map
        for (int b : B) {
            if (candidates.containsKey(b)) {
                int count = candidates.get(b);
                count++;
                candidates.remove(b);
                candidates.put(b, count);
            } else {
                candidates.put(b, 1);
            }
        }
        System.out.println("candidates = " + candidates);

        // Search leader in candidates
        int restriction = (B.length / 2) + 1;
        int leader = 0;
        for (int c : candidates.keySet()) {
            if (candidates.get(c) >= restriction) {
                System.out.println("The leader is " + candidates.get(c));
                return candidates.get(c);
            }
        }

        return leader;
    }


}
