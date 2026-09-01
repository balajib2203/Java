package Practice;

class Employee{
    private String name;
    private int salary;

    // we stored input values using this method, so we can get using non para, non - void
    public void setDetails(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
public class Prac_Void {
    static void main(String[] args) {
        Employee emp = new Employee();
        emp.setDetails("John", 10000);
        emp.displayDetails();
        System.out.println("name:" +emp.getName());
        System.out.println("salary:" +emp.getSalary());
    }
}
