package Class;

class A{
    // Private variables
 private String name;
 private int age;

    // Setter for name
 public void setName(String name) {
     this.name = name;
 }
    // Setter for age
 public void setAge(int age) {
     this.age = age;
    }

    // Display method
 public void disp(){
     System.out.println(name);
     System.out.println(age);
    }

    // Getter for name
public String getName(){
     return name;
    }
    // Getter for age
public int getAge(){
     return age;
    }
}

public class Class_Private {
    public static void main(String[] args) {
        A a = new A();
        a.setName("Balaji"); //setter
        a.setAge(23); //setter
        a.disp(); //using display method to display outputs, only setter method is used.

        // below lines are used for using getter method to access outputs
        // System.out.println(a.getName());
        // System.out.println(a.getAge());

    }
}

//private means:
//Only class A can directly access these variables.

