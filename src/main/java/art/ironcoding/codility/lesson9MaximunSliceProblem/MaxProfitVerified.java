package art.ironcoding.codility.lesson9MaximunSliceProblem;

import java.util.Arrays;

/**
 * https://github.com/DavidHerBet/java-codility/blob/master/src/main/java/com/dherbet/codility/lesson9/MaxProfit.java
 */
public class MaxProfitVerified {

    public static void main(String[] args) {
        int[] A = new int[6];
        A[0] = 23171;
        A[1] = 21011;
        A[2] = 21123;
        A[3] = 21366;
        A[4] = 21013;
        A[5] = 21367;
        System.out.println("A = " + Arrays.toString(A));
        System.out.println("The maximum possible profit is: " + solution(A));
    }

    private static int solution(int[] A) {
        int minValue = A.length == 0 ? 0 : A[0];
        int maxProfit = 0;
        for (int dailyValue : A){
            if (dailyValue < minValue){
                minValue = dailyValue;
            }
            maxProfit = Math.max(maxProfit, (dailyValue-minValue) );
        }
        System.out.println("maxProfit = " + maxProfit);
        return maxProfit;
    }


}
