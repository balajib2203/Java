package OOPS;

class Method{
    void display(){
        System.out.println("display");
    }
    void display(int a){
        System.out.println(a);
    }
}
public class Poly_MethodOverload {
    static void main(String[] args) {
        Method m = new Method();
        m.display();
        m.display(10);
    }
}

//Method overloading is when a class has multiple methods with the same name but different parameters.

//You have two methods with the same name:
//
//display()
//display(int a)
//
//But their parameters are different:
//display()       → no parameter
//display(int a)  → one int parameter
