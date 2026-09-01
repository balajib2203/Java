package Keywords;

class Father2{
    final int age = 45; // This age cannot be changed.
        final void say(){ // A final method cannot be overridden by a child class.
        System.out.println("My age is " + age);
    }
}
class Child2 extends Father2{
     int age = 25; // its normal age, we can change it.
        void say2(){ // if I use say(), it will cause error
        System.out.println("My age is " + age);
    }
}

public class Final {
    public static void main(String[] args) {
        Father2 f = new Father2();
        f.say();
        Child2 c = new Child2();
        c.age = 27; // changed age from 25 to 27, because there is no final word for this child2
        c.say2();
    }
}

// final variable: Once a value is assigned to a final variable, that value cannot be changed.

// There are two separate age variables:
//
// Father2
// └── age = 45 → final → cannot be changed
//
// Child2
// └── age = 25 → normal → can be changed