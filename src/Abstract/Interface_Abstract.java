package Abstract;

// interfaces and multiple inheritance through interfaces.

interface Father{
    abstract void say(); //// default interface uses abstract
    abstract void say2();
}
interface Mother{
    void say3();
}
class Son implements Father,Mother{ //Multiple implements using interface, but in class only one extend.
    public void say(){
        System.out.println("Iam Father");
    }
    public void say2(){
        System.out.println("How are you?");
    }
    public void say3(){
        System.out.println("Iam Mother");
    }
}
public class Interface_Abstract {
    static void main(String[] args) {
        Son son = new Son();
        son.say();
        son.say2();
        son.say3();
    }
}

// An interface is a contract that defines methods a class must implement. A class can implement multiple interfaces.

// Father        Mother
//    ↓             ↓
//    └─────┬───────┘
//          ↓
//         Son
//   implements both

//// ABSTRACT CLASS:
// abstract void turnOn();  → write abstract
//
//// INTERFACE:
// void turnOn();           → abstract is already implied