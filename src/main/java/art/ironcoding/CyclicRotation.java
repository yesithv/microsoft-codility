package art.ironcoding;

public class CyclicRotation {
    // https://app.codility.com/demo/results/trainingJQJT35-MD5/

    public static void main(String[] args) {
        //int[] A = {3, 8, 9, 7, 6};
        //int[] A = {0,0,0};
        int[] A = {1, 2, 3, 4};
        System.out.println("A[0]= " + A[0]);
        System.out.println("A[last]= " + A[A.length - 1]);

        int K = 4;
        System.out.print("The solution is: = [");
        for (int element : solution(A, K)) {
            System.out.print(element + " ");
        }
        System.out.print("] ");
    }

    public static int[] solution(int[] A, int K) {
        for (int j = 0; j < K; j++) {
            int lastElement = A[A.length - 1];
            for (int i = A.length - 1; i > 0; i--) {
                A[i] = A[i - 1];
            }
            A[0] = lastElement;
        }
        return A;
    }
}
