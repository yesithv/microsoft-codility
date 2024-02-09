package art.ironcoding.codility.lesson6Sorting;

/**
 * https://app.codility.com/programmers/lessons/6-sorting/number_of_disc_intersections/
 * https://app.codility.com/demo/results/trainingJ5WH5T-XQV/
 */
public class NumberOfDiscIntersectionsVerified {
    public static void main(String[] args) {
        // int A[] = {1, 5, 2, 1, 4, 0}; // return 11
        //int A[] = {2, 1}; // return 1
        //int A[] = {0, 2, 1}; // return 1
        int A[] = {0, 2, 2}; // return 1
        //int A[] = {2, 1, 2, 1}; // return 4
        System.out.println("The number of intersections are: " + solution(A));
    }

    public static int solution(int[] A) {
        int intersections = 0;
        for (int i = 0; i < A.length - 1; i++) {
            System.out.println("A[i] = " + A[i]);
            for (int j = i + 1; j < A.length; j++) {
                System.out.println("A[j] = " + A[j]);
                if ((i + A[i]) == (j + A[j])) {
                    intersections++;
                }
                if ((i + A[i]) < (j + A[j])) {
                    intersections = intersections + 2;
                }
            }

        }
        return intersections;
    }
}
