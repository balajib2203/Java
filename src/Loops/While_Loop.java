package Loops;

public class While_Loop {
    static void main(String[] args) {
        int n = 5;
        int fact = 1;
        int i = 1;
        /*while(i<=n){              //Entry Controlled
            fact *= i;
            i++;
        }*/
        do {                        //Exit Controlled
            fact *= i;
            i++;
        }while (i<=n);
        System.out.println("Factorial of " + n + " is " + fact);


        // Nested Loops

        for(i=1;i<=3;i++) {
            {
                for(int j=0;j<=3;j++) {
                    System.out.println(i+ ""+j);
                }
            }

        }
    }
}
