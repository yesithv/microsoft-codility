package art.ironcoding.codility.lesson4CountingElements;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
 * Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.
 */
public class MaxCounters {

    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        System.out.println("The secuence of the counters is: " + Arrays.toString(solution(A, N)));
    }

    public static int[] solution(int[] A, int N) {
        int[] B = new int[N];

        for (int i = 0; i < A.length; i++) {
            System.out.println("i = " + i + " A[i] = " + A[i]);
            if (A[i] >= 1 && A[i] <= N) {
                B[A[i] - 1]++;
            }
            if (A[i] == N + 1) {
                Arrays.fill(B, i - 1);
            }
            System.out.println("B[]:" + Arrays.toString(B));
        }
        return A;
    }

}
