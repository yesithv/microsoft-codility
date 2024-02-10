package art.ironcoding.codility.lesson7StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

/**
 * https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/
 * N voracious fish are moving along a river. Calculate how many fish are alive.
 */
public class Fish {

    public static void main(String[] args) {
        int A[] = {4, 3, 2, 1, 5}; // Fish's size
        boolean B[] = {false, true, false, false, false};
        System.out.println("Fish size: A[] = " + Arrays.toString(A));
        System.out.println("Down directions B[] = " + Arrays.toString(B));
        System.out.println("Number of Fish stay alive is: " + solution(A, B));
    }

    public static int solution(int fishSize[], boolean downDirection[]) {
        // Put the first fish into stack
        Stack<Integer> liveFish = new Stack<>();
        liveFish.push(fishSize[0]);

        // Traverse other fish size/directions
        for (int i = 1; i < fishSize.length; i++) {
            // Compare directions
            if (downDirection[i - 1] && !downDirection[i]) {
                System.out.printf("Fish meet !!!: i: " + i + " one are going to die .. =( ");
                liveFish.pop();
                if (fishSize[i - 1] > fishSize[i]) {
                    System.out.println("   --- Fish i is small: " + fishSize[i - 1] + " > " + fishSize[i]);
                    // Eat - Compare stack
                    liveFish.push(fishSize[i - 1]);
                    downDirection[i] = downDirection[i - 1];
                    fishSize[i] = fishSize[i - 1];
                } else {
                    System.out.println("   --- Fish i is big : " + fishSize[i - 1] + " < " + fishSize[i]);
                    liveFish.push(fishSize[i]);
                }
            } else {
                liveFish.push(fishSize[i]);
            }
        }
        System.out.println("liveFish = " + liveFish);
        return liveFish.size();
    }
}
