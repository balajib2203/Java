package Keywords;

class Father3{
    void say(){
        System.out.println("My Father is saying");
    }
}
class Son3 extends Father3{
    void say(){
        System.out.println("My son is saying"); // current class
        super.say();  // parent class
    }
}

public class Super {
    public static void main(String[] args) {
        Son3 son = new Son3();
        son.say(); // prints both son3 and father3
        Father3 father = new Father3();
        father.say(); // prints father3
    }
}

// super is a Java keyword used to refer to the immediate parent class.

// Father3
//   │
//   │ say()
//   ↓
// Son3
//   │
//   └── say()  ← overrides Father's say()
//          │
//          ↓
//      super.say()
//          │
//          ↓
//    Father's say()