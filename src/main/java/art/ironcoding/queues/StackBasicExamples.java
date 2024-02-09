package art.ironcoding.queues;

import java.util.Stack;

public class StackBasicExamples {

    public static void main(String[] args) {

        // Initialization of Stack
        // using Generics
        Stack<String> stack2 = new Stack<>();

        stack2.push("Geeks");
        stack2.push("For");
        stack2.push("All");
        stack2.push("People");

        // Printing the Stack Elements
        System.out.println(stack2);

        // Take the top element
        String front = stack2.peek();
        System.out.println("peek = " + front);
        System.out.println("stack2 = " + stack2);

        // Take and Delete
        String pop = stack2.pop();
        System.out.println("pop = " + pop);
        System.out.println("New stack3 = " + stack2);

        // Pop elements from the stack
        stack2.push("End");
        System.out.println("Removing .... ");
        while(!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
        System.out.println("stack2 Removed= " + stack2);
    }
}
