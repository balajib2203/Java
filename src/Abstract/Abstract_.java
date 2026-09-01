package Abstract;

abstract class computer{
    abstract void turnOn(); // while using abstract, we don't use {}, we usually call it in child class to override it, check bottom.
    abstract void turnOff();
}
class HP extends computer{
    void turnOn(){
        System.out.println("HP is on");
    }
    void turnOff(){
        System.out.println("HP is off");
    }
}
class Dell extends computer {
    void turnOn() {
        System.out.println("Dell is on");
    }

    void turnOff() {
        System.out.println("Dell is off");
    }
}

public class Abstract_ {
    public static void main(String[] args) {
        HP hp = new HP();
        hp.turnOn();
        hp.turnOff();

        Dell dell = new Dell();
        dell.turnOn();
        dell.turnOff();
    }
}

// Abstraction means hiding implementation details and defining only
// the essential functionality that child classes must implement.

//             computer
//          (abstract class)
//             /       \
//            ↓         ↓
//           HP        Dell
//            ↓         ↓
//        turnOn()   turnOn()
//        turnOff()  turnOff()

//// Abstract method: it has no body {}, only the method declaration.
//// The child class must provide the implementation by overriding it.

//// Normal method:
//
// void turnOn() {
// System.out.println("Computer is on");
//}

////Abstract method:
//
// abstract void turnOn();

//// If you're learning abstraction + runtime polymorphism:
// computer hp = new HP();
// computer dell = new Dell();
// hp    → actually HP
// dell  → actually Dell
//        computer hp = new HP();
//        computer dell = new Dell();
//        hp.turnOn();
//        hp.turnOff();
//        dell.turnOn();
//        dell.turnOff();

// computer   → parent reference/type
// c          → reference variable
// new Dell() → creates a Dell object

// computer c = new Dell();
//       ↓           ↓
//  reference      actual object