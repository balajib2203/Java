package Learn_Java;

import java.awt.*;

public class Char_Count {
    static void main() {
        String name = "Balaji";
        System.out.println(name.length());

        //Primitive because of int//
        //a and b store the actual values.
        //
        //a → 10
        //b → 20

       int a = 10;
       int b = 20;
       System.out.println(a);
       System.out.println(b);
       a = 5;
       System.out.println(a);
       System.out.println(b);


       //Object / Reference type because of Point, num1 and num2 store references to an object.//
        //num1 ──┐
        //       ↓
        //    Point Object
        //       ↑
        //num2 ──┘


       Point num1 = new Point(5,10);
       Point num2 = num1;
       System.out.println(num1);
       System.out.println(num2);
       num1.x=7;
       System.out.println(num1);
       System.out.println(num2);
    }
}
