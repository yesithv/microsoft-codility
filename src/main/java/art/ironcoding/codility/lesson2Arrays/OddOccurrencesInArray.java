package art.ironcoding.codility.lesson2Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9}; // return 7
        System.out.println("A[] = " + Arrays.toString(A));
        System.out.println("The value of unpaired element is: " + solution(A));
    }

    public static int solution(int[] A) {
        int response = 0;
        HashMap<Integer, Integer> solution = new HashMap<>();
        for (int a : A) {
            if (!solution.containsKey(a)) {
                solution.put(a, 1);
            } else {
                Integer counter = solution.get(a);
                solution.remove(a);
                counter = counter + 1;
                solution.put(a, counter++);
            }
        }
        System.out.println("solution = " + solution.toString());
        var optionalResponse = solution.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(1))
                .findAny();

        if (optionalResponse.isPresent()){
            var entry = optionalResponse.get();
            response = entry.getKey();
        }

        return response;
    }

    public static int solution1(int[] A) {

        int response = 0;
        int[] first = new int[A.length];
        int fistCount = 0;
        int[] second = new int[A.length];
        int secondCount = 0;
        for (int a : A) {
            System.out.println("a = " + a);
            if (Arrays.stream(first).noneMatch(item -> item == a)) {
                System.out.println("Go to first ");
                first[fistCount] = a;
                fistCount++;
            } else if (Arrays.stream(second).noneMatch(item -> item == a)) {
                System.out.println("Go to second");
                second[secondCount] = a;
                secondCount++;
            } else if (((Arrays.stream(first).anyMatch((item -> item == a))) && (Arrays.stream(second).anyMatch(item -> item == a)))) {
                System.out.println("Eureka !");
                response = a;
                break;
            } else {
                System.out.println("Eureka !");
                response = a;
                break;
            }
        }
        return response;
    }
}
