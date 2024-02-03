package art.ironcoding.codility.lesson2Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://github.com/DavidHerBet/java-codility?tab=readme-ov-file
 * https://app.codility.com/demo/results/trainingDYWMVE-T8R/
 * Find value that occurs in odd number of elements.
 */
public class OddOccurrencesInArrayVerified {

    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9}; // return 7
        System.out.println("A[] = " + Arrays.toString(A));
        System.out.println("The value of unpaired element is: " + solution(A));
    }

    private static int solution(int[] A) {
        Set<Integer> unique = new HashSet<>();
        for (Integer a : A) {
            if (unique.contains(a)) {
                unique.remove(a);
            } else {
                unique.add(a);
            }
        }
        return unique.iterator().next();
    }


}
