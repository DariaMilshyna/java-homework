package java_hw_9.task3;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApplication {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        System.out.println("Add element to the beginning:");
        deque.addFirst("First");
        System.out.println(deque);

        System.out.println("Add element to the end:");
        deque.addLast("Second");
        deque.addLast("Third");
        System.out.println(deque);

        System.out.println("Offer element to the beginning:");
        deque.offerFirst("Start");
        System.out.println(deque);

        System.out.println("Offer element to the end:");
        deque.offerLast("End");
        System.out.println(deque);

        System.out.println("Get first element:");
        System.out.println(deque.getFirst());

        System.out.println("Get last element:");
        System.out.println(deque.getLast());

        System.out.println("Peek first element:");
        System.out.println(deque.peekFirst());

        System.out.println("Peek last element:");
        System.out.println(deque.peekLast());

        System.out.println("Poll first element:");
        System.out.println(deque.pollFirst());
        System.out.println(deque);

        System.out.println("Poll last element:");
        System.out.println(deque.pollLast());
        System.out.println(deque);

        System.out.println("Remove first element:");
        deque.removeFirst();
        System.out.println(deque);

        System.out.println("Remove last element:");
        deque.removeLast();
        System.out.println(deque);

        System.out.println("Deque size:");
        System.out.println(deque.size());

        System.out.println("Is Deque empty:");
        System.out.println(deque.isEmpty());

        System.out.println("Clear Deque:");
        deque.clear();

        System.out.println("Is Deque empty after clear:");
        System.out.println(deque.isEmpty());
    }
}