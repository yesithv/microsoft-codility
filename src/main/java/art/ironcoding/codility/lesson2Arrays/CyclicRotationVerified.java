package art.ironcoding.codility.lesson2Arrays;

import java.util.Arrays;

/**
 * https://github.com/DavidHerBet/java-codility
 * https://app.codility.com/demo/results/trainingJQJT35-MD5/
 * Rotate an array to the right by a given number of steps.
 */
public class CyclicRotationVerified {

    public static void main(String[] args) {
        //int A[] = {1, 2, 3, 4};
        //int K = 4; // return: [1, 2, 3, 4]
        int A[] = {3, 8, 9, 7, 6};
        int K = 3; // return:  [9, 7, 6, 3, 8]

        System.out.println("The rotation of A[]=" + Arrays.toString(A) + " (" + K + ") times is: " + Arrays.toString(solution(A, K)));
    }

    public static int[] solution(int A[], int K) {

        int B[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int newIndex = (i + K) % A.length;
            B[newIndex] = A[i];
        }

        return B;
    }
}
