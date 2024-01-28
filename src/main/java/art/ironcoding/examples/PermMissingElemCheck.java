package art.ironcoding.examples;

import java.util.Arrays;

public class PermMissingElemCheck {

    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        System.out.println("The missing element is = " + solution(A));
    }

    public static int solution(int[] A) {
        System.out.println("The input array A[] is: = " + Arrays.toString(A));
        boolean[] exist = new boolean[A.length + 2];
        for (int i : A) {
            exist[i] = true;
        }
        System.out.println("exist = " + Arrays.toString(exist));
        int e = 1;
        while (e < exist.length) {
            if (!exist[e]) return e;
            e++;
        }
        System.out.println("missing = " + Arrays.toString(exist));
        return 0;
    }
}
