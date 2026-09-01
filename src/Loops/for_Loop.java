package Loops;

public class for_Loop {
    static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Balaji " +i++);

            //4 → 5     ← i++ inside println
            //5 → 6     ← i++ in for loop
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Balaji " +i++);

            //3 → 4     ← inside println
            //4 → 5     ← for loop
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Balaji " + i);
            //Prints till 100
        }
        int total = 5;
        int fact = 1;
        for (int i = 1; i <= total; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + total + " is " + fact);

        //i	Calculation	fact
        //1	1 × 1	1
        //2	1 × 2	2
        //3	2 × 3	6
        //4	6 × 4	24
        //5	24 × 5	120
    }
}
