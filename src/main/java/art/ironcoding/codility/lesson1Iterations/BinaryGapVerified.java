package art.ironcoding.codility.lesson1Iterations;

/**
 * https://github.com/DavidHerBet/java-codility
 * https://app.codility.com/demo/results/trainingRGMR4Z-2RY/
 * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 * Find longest sequence of zeros in binary representation of an integer.
 */
public class BinaryGapVerified {

    public static void main(String[] args) {
        // int N = 20; // b=10100 return=1
         int N = 15; // b=1111 return 0
        // int N = 32; // b=100000 return 0
        //int N = 9; // b=1001 return=2
        //int N = 529; // b=1000010001 return=4
        System.out.println("The number is = " + N + " And the longest binary gap is: " + solution(N));
    }

    public static int solution(int N) {
        // Convert N to binary and then to array
        String binaryRepresentation = Integer.toBinaryString(N);
        //System.out.println("binary = " + binary);

        // traverse the complete array until find 1 and then another 1: There is a gap
        // Compare the gap length and continue the process
        int binaryGap = 0;
        int countingGap = 0;
        boolean foundOne = false;
        for (int i = 0; i < binaryRepresentation.length(); i++) {
            //System.out.println("binaryRepresentation[i] = " + binaryRepresentation.charAt(i));
            if (binaryRepresentation.charAt(i) == '1' && foundOne) {
                if (countingGap > binaryGap) {
                    binaryGap = countingGap;
                }
                countingGap = 0;
            } else if (binaryRepresentation.charAt(i) == '1') {
                foundOne = true;
            } else {
                countingGap++;
            }
        }

        // Return finding
        return binaryGap;
    }
}
