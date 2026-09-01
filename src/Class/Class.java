package Class;

class ApplicationForm{
    String name;
    int age;

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class Class {
    static void main(String[] args) {
        ApplicationForm a = new ApplicationForm(); //Creating object syntax
        a.name="Balaji";
        a.age=10;
        a.display();
    }
}

//What is a class?
//A class is a blueprint/template used to create objects.