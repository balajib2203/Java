package OOPS;

class animal{
    int numoflegs = 4;
    public void say(){
        System.out.println("I am animal");
    }
    public void say1(){
        System.out.println("I am in forest");
    }
}
class Dog extends animal{
    int numoflegs = 4;
    public void say(){ // overridden because of same method name in animal class.
        System.out.println("I am dog");
    }
    public void say2(){
        System.out.println("I can bark");
    }
}
public class Poly_MethodOverRiding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.say();
        d.say1();
        d.say2();
        System.out.println(d.numoflegs);
    }

}

//Method Overloading: Same method name + different parameters.

//animal (Parent)
//│
//├── say()   → "I am animal"
//├── say1()  → "I am in forest"
//│
//└───────────────┐
//                ↓
//              Dog
//                │
//                ├── say()   → "I am dog" ← OVERRIDDEN
//                └── say2()  → "I can bark"