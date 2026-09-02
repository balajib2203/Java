package Collections;

import java.util.HashMap;

public class H_Map {
    static void main(String[] args) {
        HashMap<Integer,Character> m = new HashMap<>();
        m.put(1,'a');
        m.put(2,'b');
        m.put(3,'c');

        m.put(4, 'd');          // Add key + value
        System.out.println(m);
        System.out.println(m.get(2));               // Get value using key... pass int to access key
        System.out.println(m.containsKey(2));      // Check if key exists
        System.out.println(m.containsValue('b'));  // Check if value exists
        m.remove(2);             // Remove key-value pair
        System.out.println(m);
        System.out.println(m.size());              // Number of key-value pairs
        System.out.println(m.isEmpty());           // Check if HashMap is empty
        m.clear();               // Remove everything
        System.out.println(m);
        System.out.println(m.isEmpty());  // empty

    }
}

// HashMap is a data structure that stores data in key-value pairs. Also, keys cannot be duplicate, but values can be duplicate.