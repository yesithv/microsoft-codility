package art.ironcoding.codility;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 */
public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3}; // return 1
        System.out.println("A = " + Arrays.toString(A));
        System.out.println("The solution is: " + solution(A));
    }

    public static int solution(int[] A) {

        // Some validations
        if (A == null || A.length < 2 || A.length > 100000) {
            System.out.println("Please input and non empty array");
            return 0;
        }

        Integer minimalDifference = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {

            if (A[i] < -1000 || A[i] > 1000) {
                System.out.println("The element: " + A[i] + " must be in 2 and 100000");
            }
            //System.out.println("------- i = " + i + " ---------------");
            int leftDifference = 0;
            for (int l = 0; l <= i; l++) {
                //System.out.println("A[l] = " + A[l]);
                leftDifference = leftDifference + A[l];
            }
            //System.out.println("leftDifference = " + leftDifference);

            int rightDifference = 0;
            for (int r = i + 1; r < A.length; r++) {
                //System.out.println("A[l] = " + A[r]);
                rightDifference = rightDifference + A[r];
            }
            //System.out.println("rightDifference = " + rightDifference);

            int actualDifference = Math.abs(leftDifference - rightDifference);

            if (actualDifference < minimalDifference) {
                minimalDifference = actualDifference;
            }
            if (minimalDifference.equals(1)) {
                return minimalDifference;
            }
            System.out.println("minimalDifference = " + minimalDifference);
        }
        return minimalDifference;
    }
}
