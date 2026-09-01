package Methods;

public class Methods {
    static void main(String[] args) {
        //void non-parameterized - static inputs
        add();                                  //calling the below method
        System.out.println("add is printed");

        //void parameterized - giving inputs
        add2(4,4);
        System.out.println("add2 is printed");

        //non-void parameterized - giving inputs and storing it in main method and performing multiplication operation
        System.out.println(add3(2,3));
        int result = add3(2,3);
        result = result *5;
        System.out.println(result);
        System.out.println("add3 is printed");

        //non-void non-parameterized method
        int res = add4();
        res = res *5;
        System.out.println(res);
        System.out.println("add4 is printed");

    }

    // one method just adding (void non-parameterized - static inputs)
    public static void add(){                   //add is identifier
        int a = 10;
        int b = 15;
        int c = a + b;
        System.out.println(c);
    }

    //Parameters/Arguments means passing the input values while calling (void parameterized - giving inputs )
    public static void add2(int e,int f){
        int d = e+f;
        System.out.println(d);
    }

    //non-void parameterized method
    public static int add3(int g,int h){
        return g+h;
    }

    //non-void non-parameterized method
    public static int add4() {
        int k = 5;
        int l = 2;
        return k + l;
    }
}

//void    → returns nothing
//int     → returns an integer
//String  → returns a String
//double  → returns a decimal
//boolean → returns true/false

//void → Do something → no value comes back
//int → Calculate something → integer comes back
//String → Get something → text comes back

//Parameterized method - A parameterized method is a method that accepts input/parameters inside the (). Eg: add(10, 20);
//Non-parameterized method - A non-parameterized method is a method that does not accept any input/parameters. Eg: getNumber();

//add(10, 20);       // Parameterized (Passing inputs)
//getNumber();       // Non-parameterized (Not passing inputs)