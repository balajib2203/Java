package Collections;

import java.util.Stack;

public class Stackk {
    static void main(String[] args) {

        Stack<Integer> st = new Stack<>(); // Stack<"Data Type"> like what Int or String
        st.push(1); // adding 1
        st.push(2);
        st.push(3);
        st.add(22); // add also do the same thing as push
        System.out.println(st);
        System.out.println(st.pop());// printing what is inside stack.
        System.out.println(st.peek()); // peek will give what is on the top of the stack, the last added element.
         //
    }
}

//A Stack is a collection that follows LIFO — Last In, First Out.

///    ┌────┐
///    │ 30 │ ← Top
///    ├────┤
///    │ 20 │
///    ├────┤
///    │ 10 │
///    └────┘


//// Push
//| 2 |  ← TOP
//| 1 |
//-----

// peek() means: Look at the top element, but DON'T remove it.
// pop() Remove the last-added (top) element and return/print it.
//      push(1)
//         ↓
//        [1]
//
//      push(2)
//         ↓
//      [1, 2]
//
//      peek()
//         ↓
//         2
//       [1, 2]       ← 2 is NOT removed
//
//        pop()
//         ↓
//         2
//        [1]          ← 2 IS removed