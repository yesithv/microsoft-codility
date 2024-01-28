package art.ironcoding.examples;

import java.util.Arrays;

/**
 * https://github.com/DavidHerBet/java-codility
 * https://app.codility.com/demo/results/trainingCFEUHV-WQ2/
 */
public class PermMissingElem {

    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5}; // Should return 4
        // int[] A = {2, 3, 1, 5, 7, 4}; // Should return 6
        // int[] A = {1, 3}; // Should return 2
        // int[] A = {5, 4, 3, 2}; // Should return 1
        // int[] A = {1, 0, 2, 3}; // Should return 0
        //int[] A = {1, 2, 1000002, 3}; // Should return 0
        System.out.println("The missing element is: " + solution(A));
    }

    public static int solution(int[] A) {
        System.out.println("The input array is: = " + Arrays.toString(A));
        // Write an efficient algorithm
        int minValue = 0;
        int maxValue = 100001;
        int missingElement = 0;

        for (int i = 0; i < A.length; i++) {
            int need = i + 1;
            System.out.println("i = " + i + "  A[i] = " + A[i] + " need: " + need);
            if (A[i] <= minValue || A[i] > maxValue) {
                System.out.println("Error: Validation input out borders");
                return 0;
            }

            if (Arrays.stream(A).noneMatch(x -> x == need)) {
                missingElement = need;
                System.out.println("missingElement = " + missingElement);
                break;
            }

        }
        return missingElement;
    }
}
