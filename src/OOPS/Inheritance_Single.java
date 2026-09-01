package OOPS;

class Father{
    char gender = 'M';
    void display(){
        System.out.println("Parent class");
    }
}
class Son extends Father{

}
public class Inheritance_Single {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.gender);
        son.display();
    }
}

// Single inheritance is when one child class inherits from one parent class.

//Father (Parent)
//│
//├── gender = 'M'
//└── display()
//       ↑
//       │ extends
//       │
//Son (Child)
//│
//└── inherits gender and display()