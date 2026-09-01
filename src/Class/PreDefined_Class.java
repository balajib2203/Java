package Class;

public class PreDefined_Class {
    static void main(String[] args) {

        // Converts the integer 22 into a String "22".
        String a = Integer.toString(22);
        System.out.println(a);

        // Converts decimal number 15 into its binary String "1111".
        String b = Integer.toBinaryString(15);
        System.out.println(b);

        // Converts the String "1111" into an integer.
        // By default, it treats "1111" as a decimal number, so the result is 1111.
        int x = Integer.valueOf(b);
        System.out.println(x);

        // Converts the String "1111" into an int.
        // By default, it also treats "1111" as decimal, so the result is 1111.
        int y = Integer.parseInt(b);
        System.out.println(y);

        // Converts the String "5.9999" into a double value.
        String z = "5.9999";
        System.out.println(Double.parseDouble(z));

        // Compares "Balaji" with "Tom".
        // They are different, so equals() returns false.
        String s = "Balaji";
        System.out.println(s.equals("Tom"));

        // charAt(3) gets the character at index 3.
        // B=0, a=1, l=2, a=3 → output: a
        System.out.println(s.charAt(3));

        // Converts the String "Balaji" into a character array.
        // arr[0] gets the first character → B
        // arr[1] gets the second character → a
        char[] arr = s.toCharArray();
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        // "Balaji"
        //   ↓
        // char[]
        //   ↓
        // B  a  l  a  j  ia
    }
}
