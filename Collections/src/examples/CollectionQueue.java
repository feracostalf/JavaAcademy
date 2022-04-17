package examples;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue <String> ptyQueue= new PriorityQueue<>();
        ptyQueue.add("IBM");
        ptyQueue.add("JAVA");
        ptyQueue.add("ACADEMIC");

        System.out.println(ptyQueue);

        ptyQueue.offer("Fernando");
        System.out.println(ptyQueue);

        String first=ptyQueue.poll();
        System.out.println(first);

        ArrayDeque<String> deque=new ArrayDeque<>();
        deque.add("IBM");
        deque.add("JAVA");
        deque.add("ACADEMIC");
        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);

    }
}
