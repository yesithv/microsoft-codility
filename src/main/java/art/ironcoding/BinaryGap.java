package art.ironcoding;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryGap {

    public static void main(String[] args) {

        //https://app.codility.com/demo/results/trainingRGMR4Z-2RY/
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