package Arrays;

public class Arrays {
    static void main(String[] args) {
        int [] rollno = new int [5]; // [] indicates array and int for integer type array
                                     // and [5] for allocate 5 spaces
        rollno[0] = 1;
        rollno[4] = 2;
        rollno[1] = 34;
        // rollno[5] = 5; Index 5 out of bounds for length 5
        for(int i=0;i<5;i++){
            System.out.println(rollno[i]);
        }

    }
}

//An array in Java is a way to store multiple values of the same data type in one variable.