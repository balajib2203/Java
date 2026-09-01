package Practice;

class A {
    private String name;
    private int age;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getMarks() {
        return marks;
    }
    public void disp(){
        System.out.println("Name: "+name+" Age: "+age+" Marks: "+marks);
        if(marks>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        A student = new A ();
        student.setName("Balaji");
        student.setAge(23);
        student.setMarks(85);
        student.disp();
    }
}
