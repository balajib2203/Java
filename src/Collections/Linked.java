package Collections;

import java.util.LinkedList;

public class Linked {
    static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(11);
        l.add(22);
        l.add(33);
        l.add(44);

        System.out.println(l);
        l.remove(1); // index of 1 = 22 will be removed
        l.set(2, 99);           // Changes index 1 to 99
        boolean a =l.contains(99);         // Checks if 22 exists → true/false
        System.out.println(l);
        System.out.println(a);
    }
}

// A LinkedList is a collection where elements are stored as nodes, and each node is connected to the next node.
// Duplicates allowed
// [10 | next] → [20 | next] → [30 | null]