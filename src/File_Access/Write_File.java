package File_Access;

import java.io.File;
import java.io.FileWriter; // Used to write file

public class Write_File {
    public static void main(String[] args) {
        try {
            // Creates a File object that points to Data.txt.
            // If the file does not exist, FileWriter can create it.
            File f = new File("Data.txt");
            // Creates a FileWriter object to write data into the file.
            FileWriter fw = new FileWriter(f);

            fw.write("I am learning JAVA");
            fw.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

// FileWriter     → writes characters to file
// BufferedWriter → efficiently writes characters + provides newLine()