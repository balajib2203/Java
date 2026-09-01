package OOPS;

class Father2{
    char gender = 'M';;
    void display(){
        System.out.println("This is Father2");
    }
}
class Daughter extends Father2{
    char gender ='F';
}

class Son2 extends Father2{
}

public class Inheritance_Hierarchical {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.display();
        System.out.println(d.gender);
        Son2 s = new Son2();
        s.display();
        System.out.println(s.gender);

    }
}

// above code is 1 parent and 2 child.

// Hierarchical inheritance is when multiple child classes inherit from the same parent class.

//             Father2
//             /     \
//            ↓       ↓
//       Daughter    Son2