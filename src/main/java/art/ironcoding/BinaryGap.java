package art.ironcoding;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryGap {

    public static void main(String[] args) {

        /*
        https://app.codility.com/demo/results/trainingRGMR4Z-2RY/
        Task description
        A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

                For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

                Write a function:

        class Solution { public int solution(int N); }

        that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

        For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

                Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..2,147,483,647].

         */

        System.out.println("Hello and welcome!");
        System.out.println("solution = " + solution(1041));
    }

    public static int solution(int N) {
        // found the binary representation of N
        String binaryRepresentation = Integer.toBinaryString(N);
        System.out.println("Int Number: " + N + ".  BinaryRepresentation = " + binaryRepresentation);

        // Go through String finding gaps
        List<Integer> gaps = new ArrayList<>();
        int actualGapLenght = 0;
        for (char character : binaryRepresentation.toCharArray()) {
            if (character == '1') {
                System.out.println("Found one possible gap of length = " + actualGapLenght);
                gaps.add(actualGapLenght);
                actualGapLenght = 0;
            } else {
                actualGapLenght++;
            }
        }

        // Remove zeros set by default
        List<Integer> gapsWithOutZero = gaps.stream()
                .filter(gap -> gap != 0)
                .collect(Collectors.toList());

        System.out.println("Total gaps = " + gapsWithOutZero);

        return gapsWithOutZero.isEmpty() ? 0 : Collections.max(gapsWithOutZero);


    }
}