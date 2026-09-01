package Learn_Java;

public class Jump_Statements {
    static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i==5){
                //break; // to stop printing
                continue; // to remove that particular condition i=5, then continue printing
            }
            System.out.println(i);
        }
    }
}
