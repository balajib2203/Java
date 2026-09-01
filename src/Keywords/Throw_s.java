package Keywords;

public class Throw_s {
    static void check(int age) {
        if (age < 18) {
            throw new ArithmeticException("age invalid");
        }
    }

        public static void main(String[] args) {
        try{
            check(17);
        }
        catch (Exception A){
            System.out.println(A); // it will print what kind of exception along with throw "" message.
            System.out.println(A.getMessage()); // it will print only throw "" message
        }
            System.out.println("Hello world");
        }
    }

// throw is a Java keyword used to manually throw an exception when a specific condition occurs.

//