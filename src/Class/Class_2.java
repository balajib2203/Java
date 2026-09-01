package Class;

class ApplicationForm1{
    String name;
    int age;

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Main {
    static void main(String[] args) {
        ApplicationForm1 a = new ApplicationForm1(); //Creating object syntax
        a.name="Balaji";
        a.age=10;
        a.display();

        ApplicationForm1 b = new ApplicationForm1(); //Creating object syntax
        b.name="Jakadi";
        b.age=20;
        b.display();
    }
}

//| Program 1                     | Program 2                     |
//| ----------------------------- | ----------------------------- |
//| `ApplicationForm1` class      | `ApplicationForm` class       |
//| Creates **2 objects**         | Creates **1 object**          |
//| Object `a` → Balaji, 10       | Object `a` → Balaji, 10       |
//| Object `b` → Jakadi, 20       | No object `b`                 |
//| Prints 2 people's information | Prints 1 person's information |


//              ApplicationForm
//                 CLASS
//              /     |     \
//             ↓      ↓      ↓
//            a       b       c
//         Balaji   Jakadi   John
//           10       20      30