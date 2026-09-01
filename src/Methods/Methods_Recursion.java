package Methods;

public class Methods_Recursion {
    public static void main(String[] args) {

        Nat(10);

    }

    public static void Nat(int n){

        //Base Case - To stop
        if(n==1){
            System.out.println(1);
        }

        // Recursive Case - To do until it reaches stop condition
        else{
            System.out.println(n);
            Nat(n-1);
        }
    }
}

//Recursion is when a method calls itself repeatedly until a condition tells it to stop.

//A base case is the condition in recursion that tells the method to stop calling itself.

//The recursive case is the part of a recursive method where the method calls itself again with a smaller or changed value.