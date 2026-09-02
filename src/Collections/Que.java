package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Que {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.size()); // There are 3 elements.
        System.out.println(q); // [1, 2, 3]
        q.offer(4);
        System.out.println(q.poll()); // poll() removes 1 (First In, First Out).
        System.out.println(q);
    }
}

// Queue is a linear data structure that follows FIFO (First In, First Out).

// add()      → adds
// contains() → checks if element exists
// size()     → checks how many elements
// println(q) → prints the Queue