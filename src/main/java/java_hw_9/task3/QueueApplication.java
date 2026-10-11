package java_hw_9.task3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApplication {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        System.out.println("Add elements to Queue:");
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println(queue);

        System.out.println("Offer element:");
        queue.offer("Fourth");
        System.out.println(queue);

        System.out.println("Peek first element:");
        System.out.println(queue.peek());

        System.out.println("Element first element:");
        System.out.println(queue.element());

        System.out.println("Poll first element:");
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println("Remove first element:");
        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println("Queue size:");
        System.out.println(queue.size());

        System.out.println("Is Queue empty:");
        System.out.println(queue.isEmpty());

        System.out.println("Clear Queue:");
        queue.clear();

        System.out.println("Is Queue empty after clear:");
        System.out.println(queue.isEmpty());
    }
}