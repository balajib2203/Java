package Practice;

class emp{
    static void checksalary(int salary){
        if(salary<15000){
            throw new ArithmeticException("Salary is too low");
        }
        else{
            System.out.println("Salary is good");
        }
    }
}


public class Employeee {
    public static void main(String[] args) {
        emp em = new emp();
        try{
            em.checksalary(1000);
        }
       catch (ArithmeticException e){
            System.out.println(e);
       }
    finally {
            System.out.println("Program continues");
        }
    }
}
