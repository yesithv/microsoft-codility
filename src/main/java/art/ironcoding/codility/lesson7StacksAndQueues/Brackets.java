package art.ironcoding.codility.lesson7StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
 * Determine whether a given string of parentheses (multiple types) is properly nested.
 */
public class Brackets {

    public static void main(String[] args) {
        String S = "{[()()]})";
        System.out.println("S = " + S);
        System.out.println("Is properly nested ? " + solution(S));

    }

    public static boolean solution(String S) {
        Stack<String> symbolsStack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            //System.out.println("S.charAt(i) = " + S.charAt(i));
            String item = String.valueOf(S.charAt(i));
            //System.out.println("item = " + item);
            if (symbolsStack.empty()) {
                symbolsStack.push(item);

            } else {
                if (item.equals("{") || item.equals("[") || item.equals("(")) {
                    symbolsStack.push(item);
                } else {

                    if (item.equals("}") && "{".equals(symbolsStack.peek())) {
                        symbolsStack.pop();
                    }

                    if (item.equals("]") && "[".equals(symbolsStack.peek())) {
                        symbolsStack.pop();
                    }

                    if (item.equals(")") && "(".equals(symbolsStack.peek())) {
                        symbolsStack.pop();
                    }
                }


            }
        }
        System.out.println("symbolsStack = " + symbolsStack);
        return symbolsStack.empty();
    }
}
