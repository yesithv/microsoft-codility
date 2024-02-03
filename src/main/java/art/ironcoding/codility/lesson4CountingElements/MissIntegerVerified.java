package art.ironcoding.codility.lesson4CountingElements;

import java.util.Arrays;

/**
 * https://github.com/DavidHerBet/java-codility
 * https://app.codility.com/demo/results/trainingQKV5G6-8SR/
 * Find the smallest positive integer that does not occur in a given sequence.
 */
public class MissIntegerVerified {
    public static void main(String[] args) {
        // int A[] = {-1,-3}; // return: 1 ?
        int A[] = {1,2,3}; // return: 4 ?
        // int A[] = {1, 3, 6, 4, 1, 2}; // return: 5
        System.out.println("Int the Array = " + Arrays.toString(A) + " The smallest positive is: " + solution(A));
    }

    public static int solution(int A[]) {
        // Create boolean array (B) with the same length
        boolean B[] = new boolean[A.length + 1];

        // put true in the B index with the A value
        for (int i : A) {
            B[i] = true;
        }
        System.out.println("B = " + Arrays.toString(B));

        // Return the false value
        for (int j = 1; j < B.length; j++) {
            if(!B[j]){
                return j;
            }
        }
        return A.length + 1;
    }
}
