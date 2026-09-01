package Loops;

public class if_else {
    public static void main(String[] args) {

        char a = 'P';
        int total = 40;
        if(a == 'P') {
            if(total <= 100) {
                System.out.println("Percentage");
            }
            System.out.println("Present");
        }
        else if(a == 'O') {
            System.out.println("On Duty");
        }
        else {
            System.out.println("Not Present");
        }
        System.out.println("Program Ends");
    }
}
