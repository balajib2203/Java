package OOPS;

class GrandFather1 {
    char gender ='M';
    void display(){
        System.out.println("This is grandparent");
    }
}
class Father1 extends GrandFather1{
    char gender ='m'; // overridden

}

class Son1 extends Father1{

}

public class Inheritance_MultiLevel {
    public static void main(String[] args) {
        Son1 son = new Son1();
        son.display();
        System.out.println(son.gender);
    }
}

// Multilevel inheritance is when a class inherits from another class, which itself inherits from another class.

//GrandFather1
//      ↓
//   Father1
//      ↓
//    Son1