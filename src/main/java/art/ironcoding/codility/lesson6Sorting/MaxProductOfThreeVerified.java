package art.ironcoding.codility.lesson6Sorting;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
 * https://github.com/DavidHerBet/java-codility/blob/master/src/main/java/com/dherbet/codility/lesson6/MaxProductOfThree.java
 */
public class MaxProductOfThreeVerified {
    public static void main(String[] args) {
        int A[] = {-3, 1, 2, -2, 5, 6, 1, -1, -1, -1}; // return 60
        System.out.println("A[] = " + Arrays.toString(A));
        System.out.println("The maximun triplet is: " + solution(A));
    }

    public static int solution(int A[]) {
        Arrays.sort(A);
        System.out.println("Arrays.toString(A) = " + Arrays.toString(A));
        int N = A.length;
        int firstTwoElementsPlusLastElementTripletProduct = A[0] * A[1] * A[N - 1];
        int lastElementsTripletProduct = A[N - 1] * A[N - 2] * A[N - 3];
        if (lastElementsTripletProduct > firstTwoElementsPlusLastElementTripletProduct) {
            return lastElementsTripletProduct;
        } else {
            return firstTwoElementsPlusLastElementTripletProduct;
        }
    }
}
