package Class;
import java.util.Scanner;

public class Scanner_Class {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = input.nextInt();
        System.out.println(a);

        System.out.print("Enter float number: ");
        float b = input.nextFloat(); // for decimal numbers.
        System.out.println(b+2);

        System.out.print("Enter text: ");
        String text = input.next(); // Even if we type "Hello World", only the first word "Hello" will be printed.
        System.out.println(text);

        input.nextLine(); // consume the leftover Enter

        System.out.print("Enter text: ");
        String text2 = input.nextLine(); // This will print what we type (whole line).
        System.out.println(text2);

        System.out.print("Enter text: ");
        char text3 = input.next().charAt(0); // Whatever we type, it will take only the 1st char of 1st word
        System.out.println(text3);

    }
}
