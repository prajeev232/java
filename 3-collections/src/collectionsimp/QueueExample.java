package collectionsimp;

/*
Follows FIFO. Implementations:
LinkedList (when used as a Queue via the Queue interface)
ArrayDeque - Double-ended queue implementation that can be used as a FIFO queue or LIFO stack.
PriorityQueue - Elements are ordered by priority (natural order or custom Comparator).
*/

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> ticketQueue = new LinkedList<Integer>();

        ticketQueue.add(1);
        ticketQueue.add(2);
        ticketQueue.add(3);

        Integer next = ticketQueue.peek();
        System.out.println("Next in head: " + next);

        while (!ticketQueue.isEmpty()) {
            Integer served = ticketQueue.poll(); // remove head of queue
            System.out.println("Serving ticket number: " + served);
        }

        System.out.println(ticketQueue);
    }
}
