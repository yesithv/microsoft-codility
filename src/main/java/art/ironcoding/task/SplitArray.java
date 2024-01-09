package art.ironcoding.task;

import java.util.ArrayList;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {
        //int A[] = {2, 7, 4, 6, 3, 1};
        //int A[] = {-1 , 1};
        //int A[] = {2, -1};
        //int A[] = {1, 2, 4, 3};
        int A[] = {-1, -3, 4, 7, 7, 7};
        System.out.print("The solution is: = " + solution(A));
    }

    public static boolean solution(int[] A) {
        // Validate input data
        if (A.length < 2 || A.length > 100000) {
            return false;
        }

        // Only in case of a 'single' pair
        if (A.length == 2) {
            return (A[0] + A[1]) % 2 == 0 ? false : true;
        }
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        // odd + odd = even
        // even + even = even
        // odd + even = odd
        for (int item : A) {
            if (item % 2 == 0) {
                evens.add(item);
            } else {
                odds.add(item);
            }
        }

        // In case the two List are the same size, means we can to have an odds pairs
        return evens.size() == odds.size() ? true : false;
    }
}
