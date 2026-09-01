package Keywords;

class Father{
    static int age = 50;
    static void say(){
        System.out.println("I am Father");
    }
}
class Child extends Father{
    static void display(){
        System.out.println("I am Child");
    }
}

public class Static {
    public static void main(String[] args) {
        System.out.println(Father.age + " This is father age"); // initially father age 50
        Child.age = 18; // changing child age to 18, accessing Father's inherited static age through Child and changing it to 18
        System.out.println(Father.age + " This is father age"); // age updated and printing father age as 18
        System.out.println(Child.age + " This is child age"); // child inherits father so, child age also 18
        Child.say(); // child prints father
        Child.display(); // child prints child


// child oda age maathura nala, father oda age um maaridum 50 to 18.

    }
}

// using static means, there is no need to create object, we can directly access using class name.

//static means a variable or method belongs to the class rather than an individual object, so it can be accessed directly using the class name without creating an object.

//Father.age
//    ↓
//  100
//    ↑
//Child.age