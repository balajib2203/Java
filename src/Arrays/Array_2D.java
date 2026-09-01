package Arrays;

public class Array_2D {
    static void main(String[] args) {
        int [][] matrix = new int [3][2]; //1st[row],2nd[column]; [3][2] sizes
        matrix[0][0] = 14;
        matrix[2][1] = 22;
        matrix[1][1] = 99;

        for (int i=0;i<3;i++){ //for row loop
            for (int j=0;j<2;j++){ //for column loop
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
//A 2D array means an array with rows and columns, like a table or Excel sheet.