package art.ironcoding.queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class QueuesBasicExample {

    // https://www.geeksforgeeks.org/queue-interface-java/
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // add elements to the queue
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        // print the queue
        System.out.println("Queue: " + queue);

        // remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);

        // print the updated queue
        System.out.println("Queue after removal: " + queue);

        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);

        // add another element to the queue
        queue.add("date");

        // print the updated queue
        System.out.println("Queue after peek: " + queue);

        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
