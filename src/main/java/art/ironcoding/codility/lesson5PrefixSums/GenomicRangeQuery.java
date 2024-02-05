package art.ironcoding.codility.lesson5PrefixSums;

import java.util.Arrays;

public class GenomicRangeQuery {

    public static void main(String[] args) {
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        System.out.println("Consecutive answers are = " + Arrays.toString(solution(S, P, Q)));
    }

    public static int[] solution(String S, int[] P, int[] Q) {
        int[] consecutives = new int[Q.length];

        for (int i = 0; i < P.length; i++) {
            String query = S.substring(P[i], Q[i] + 1);
            System.out.println("query = " + query);

            if (query.contains("T")) {
                consecutives[i] = 4;
            }
            if (query.contains("G")) {
                consecutives[i] = 3;
            }
            if (query.contains("C")) {
                consecutives[i] = 2;
            }
            if (query.contains("A")) {
                consecutives[i] = 1;
            }
/*
            int minimal = Integer.MAX_VALUE;
            for (int j = 0; j < query.length(); j++) {
                int itemValue = 0;
                if (query.charAt(j) == 'A') {
                    itemValue = 1;
                }
                if (query.charAt(j) == 'C') {
                    itemValue = 2;
                }
                if (query.charAt(j) == 'G') {
                    itemValue = 3;
                }
                if (query.charAt(j) == 'T') {
                    itemValue = 4;
                }

                if (itemValue < minimal) {
                    minimal = itemValue;
                }
            }
            consecutives[i] = minimal;
*/
        }

        return consecutives;
    }
}
