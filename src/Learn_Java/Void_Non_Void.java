package Learn_Java;

class Student {

    private String name;
    private int age;

    // =========================
    // VOID METHOD
    // =========================

    // This method takes an input but returns NOTHING.
    // It is used to SET/CHANGE the name.
    public void setName(String name) {
        this.name = name;
    }

    // This is also a VOID method.
    // It sets/changes the age but does not return a value.
    public void setAge(int age) {
        this.age = age;
    }


    // =========================
    // NON-VOID METHOD
    // =========================

    // This method returns a String value.
    // It returns the name when we ask for it.
    public String getName() {
        return name;
    }

    // This method returns an int value.
    // It returns the age when we ask for it.
    public int getAge() {
        return age;
    }
}


public class Void_Non_Void {

    public static void main(String[] args) {

        // Creating an object
        Student s = new Student();


        // =========================
        // USING VOID METHODS
        // =========================

        // Sending "Balaji" into setName().
        // The method stores it in the object's name.
        s.setName("Balaji");

        // Sending 23 into setAge().
        // The method stores it in the object's age.
        s.setAge(23);


        // =========================
        // USING NON-VOID METHODS
        // =========================

        // getName() returns "Balaji".
        // The returned value is stored in the variable 'name'.
        String name = s.getName();

        // getAge() returns 23.
        // The returned value is stored in the variable 'age'.
        int age = s.getAge();


        // Now we can use the returned values again.
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

//// VOID METHOD:
//// A void method performs an action but does not return any value.
//// Example: setName(), setAge(), display()
//// NON-VOID METHOD:
//// A non-void method returns a value when it is called.
//// The returned value can be stored and used again.
//// Example: getName(), getAge()

// Void means, No return just storing

// Non - void means, it will return value