package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Itera_tor {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator it = list.iterator();
        while (it.hasNext()) { // Check if next element exists
            System.out.println(it.next()); // Get next element
        }
    }
}

// Iterator is an object used to traverse (go through) elements of a Collection one by one.
// Iterator = another way to traverse a Collection, with safe removal support.