package art.ironcoding.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://github.com/DavidHerBet/java-codility
 * https://app.codility.com/demo/results/trainingQKV5G6-8SR/
 * Find the smallest positive integer that does not occur in a given sequence.
 */
public class MissInteger {
    public static void main(String[] args) {
        int[] A = {3, 6, 4, 1, 2};
        // int[] A = {3, 1, 2};
        // int[] A = {-3, -2};
        System.out.print("The solution is: = " + solution(A));
    }

    public static int solution(int[] A) {
        List<Integer> numbers = new ArrayList<>();
        Arrays.stream(A).forEach(operand -> numbers.add(operand));
        Integer min = Collections.min(numbers);
        if (min < 0) return 1;

        boolean foundNext = false;
        for (int k = 0; k < numbers.size(); k++) {
            for (int item : A) {
                if (item == min + 1) {
                    min = item;
                    foundNext = true;
                    break;
                } else {
                    foundNext = false;
                }
            }
            if (!foundNext) break;
        }

        return min + 1;
    }
}
