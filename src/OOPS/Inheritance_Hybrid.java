package OOPS;

class Father3{
    char gender = 'M';;
    void display(){
        System.out.println("This is Father3");
    }
}
class Daughter3 extends Father3{
    char gender ='F';
}

class Son3 extends Father3{
}

class GrandDaughter3 extends Daughter3{
    char gender = 'S';
    void display(){
        System.out.println("This is GrandDaughter3");
    }
}
public class Inheritance_Hybrid {
    public static void main(String[] args) {
        GrandDaughter3 d = new GrandDaughter3();
        d.display();
        System.out.println(d.gender);
        Daughter3 d2 = new Daughter3();
        d2.display();
        System.out.println(d2.gender);

    }
}

// Hybrid inheritance is a combination of two or more types of inheritance in one structure.

//             Father3
//             /     \
//            ↓       ↓
//       Daughter3   Son3
//            ↓
//            ↓
//     GrandDaughter3

// Hybrid inheritance -> GrandDaughter3 -> Daughter3 -> Father3.

// Hierarchical inheritance -> Father3 -> Daughter3 -> Son3.