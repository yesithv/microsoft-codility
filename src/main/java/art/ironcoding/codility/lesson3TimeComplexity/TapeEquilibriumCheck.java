package art.ironcoding.codility.lesson3TimeComplexity;

import java.util.Arrays;

/*
 * https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 */
public class TapeEquilibriumCheck {
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3}; // Should return 1
        System.out.println("Arrays.toString(A) = " + Arrays.toString(A));
        System.out.println("The solution is = " + solution(A));
    }

    public static int solution(int[] A) {

        int totalSum = A[0];
        int[] leftDifference = new int[A.length];
        leftDifference[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            leftDifference[i] = leftDifference[i - 1] + A[i];
            totalSum = totalSum + A[i];
        }
        System.out.println("leftDifference = " + Arrays.toString(leftDifference));
        System.out.println("totalSum = " + totalSum);

        int minimalDifference = Integer.MAX_VALUE;
        for (int j = 0; j < leftDifference.length - 1; j++) {
            int rightDifference = totalSum - leftDifference[j];
            //System.out.println("left: " + leftDifference[j] + " rightDifference +  = " + rightDifference);
            int difference = Math.abs(leftDifference[j] - rightDifference);
            if (difference < minimalDifference) {
                minimalDifference = difference;
            }
            System.out.println("difference = " + difference);
        }

        return minimalDifference;
    }
}
