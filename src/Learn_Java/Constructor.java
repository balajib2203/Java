package Learn_Java;

class Construct{
    int rollnumber;
    int marks;

    // Non - Parameterized Constructor
    Construct(){ // use the class name to create a constructor
        System.out.println("This is non - parameterized Constructor");
        rollnumber = 22;
        marks = 55;
    }
    // Parameterized Constructor - No default values
    Construct(int num, int mark){
        System.out.println("This is parameterized Constructor");
        rollnumber = num;
        marks = mark;
    }

}
public class Constructor {
    static void main(String[] args) {

        // Default Constructor - (due to error writing here) creating upper class Construct(){}, this is default Constructor.
        Construct b = new Construct();
        System.out.println(b.rollnumber);
        System.out.println(b.marks);

        // Non - Parameterized Constructor
        Construct c = new Construct(); // when ever the object "c" is created, the default values in Construct will be called.
        System.out.println(c.rollnumber);
        System.out.println(c.marks);

        // Parameterized Constructor - passing the value instead of default
        Construct d = new Construct(42434,35); // when ever the object "c" is created, the default values in Construct will be called.
        System.out.println(d.rollnumber);
        System.out.println(d.marks);
    }
}

// A constructor is a special method that is automatically called
// when you create an object. It is mainly used to initialize the object's values.

// method     → can return a value / void
// constructor → NO return type