package Learn_Java;

public class Switch_Case {
    static void main(String[] args) {
        char attendance = 'A';
        switch(attendance){
            case 'A':
                System.out.println("Attendance");
                break;
            case 'B':
                System.out.println("No Attendance");
                break;
             case 'C':
                 System.out.println("On Duty");
                break;
            default:
                System.out.println("Invalid Attendance");
        }
    }

}
