package art.ironcoding.codility.lesson9MaximunSliceProblem;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_profit/
 * Given a log of stock prices compute the maximum possible earning.
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] A = new int[6];
        A[0] = 23171;
        A[1] = 21011;
        A[2] = 21123;
        A[3] = 21366;
        A[4] = 21013;
        A[5] = 21367;
        System.out.println("A = " + Arrays.toString(A));
        //System.out.println("The maximum possible profit is: " + solution(A));
        System.out.println("The maximum possible profit is: " + solution(A));
    }

    public static int solution(int[] stock) {
        // Sort stock

        int[] stockSorted = stock.clone();
        Arrays.sort(stockSorted);
        System.out.println("stockSorted = " + Arrays.toString(stockSorted));
        System.out.println("stock = " + Arrays.toString(stock));

        int minValue = stockSorted[0];
        System.out.println("minValue = " + minValue);

        int minValueIndex = Integer.MAX_VALUE;
        int maxValue = 0;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == minValue) {
                minValueIndex = i;
                System.out.println("i = " + i + " minValue = " + minValue);
            } else {
                if (stock[i] > maxValue && i > minValueIndex) {
                    maxValue = stock[i];
                    System.out.println("i = " + i + " maxValue = " + maxValue);
                }
            }
        }
        System.out.println("minValueIndex = " + minValueIndex);

        int profit = maxValue - minValue;
        return Math.max(profit, 0);
    }

}
