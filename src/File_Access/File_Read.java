package File_Access;

import java.util.Scanner;
import java.io.File; //// This is used to access.

public class File_Read {
    static void main(String[] args) {
        try {
            //  File f = new File("D:/JavaFiles/Data.txt");
            File f = new File("Data.txt"); // Creating object, and inside we are passing the location of the file.
            // Here Data.txt is inside same folder, so direct access, if it's diff, give path.
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()) { // "Is there another line available to read?"
                System.out.println(sc.nextLine()); // "Give me the next line from the file."
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Is there another line?
//       ↓
//     true
//       ↓
// Read that line
//       ↓
// Print it
//       ↓
// Check again
//       ↓
// No more lines → false
//       ↓
// Stop
