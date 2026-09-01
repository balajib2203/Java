package OOPS;

// Single level inheritance

class Bank{
    int numofbank = 5;

    public static void IOB(){
        System.out.println("I am IOB Bank");
    }
    public void SBI(){
        System.out.println("I am SBI Bank");
    }
}

class atm extends Bank{
    int numofatm = 2;
    Boolean ATM = true;
}

public class Inheritance {
    public static void main(String[] args) {
        atm a = new atm();
        a.IOB();
        a.SBI();
        // a.ATM = false; this makes true into false.
        // why using sout because we defined value directly it does not print, so we are manually printing
        System.out.println(a.numofbank);
        System.out.println(a.ATM);
        System.out.println(a.numofatm);

    }
}

// Inheritance is an OOP concept where a child class acquires the properties
// and methods of a parent class using extends.

//      Bank (Parent)
//      │
//      ├── numofbank = 5
//      ├── IOB()
//      └── SBI()
//      ↑
//      │ extends
//      │
//      atm (Child)
//      │
//      ├── numofatm = 2
//      └── ATM = true