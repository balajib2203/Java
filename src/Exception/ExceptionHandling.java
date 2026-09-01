package Exception;

public class ExceptionHandling {
    static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int ans = a/b;
        }
        catch(ArithmeticException A){ // if we don't know what kind of exception, use "Exception". 'A' is object.
            System.out.println("Exception, b is: "+b);
        }
        finally{
            System.out.println("Finally Block"); // finally is a block that normally executes whether an exception occurs or not.
        }

        System.out.println("Hello world");

    }
}

// Exception handling is a mechanism in Java used to handle runtime errors so the
// program can continue executing instead of terminating unexpectedly.

// try
//  ↓
// 5 / 0
//  ↓
// Exception occurs
//  ↓
// catch
//  ↓
// Print error message
//  ↓
// Continue program
//  ↓
// Hello world