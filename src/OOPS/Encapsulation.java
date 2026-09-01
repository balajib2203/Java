package OOPS;

class BankAccount{
    private String accountHolder;
    private int accountNumber;
    private int balance;

    public void setAccountHolder(String accoundHolder){
        this.accountHolder = accoundHolder;
    }
    public void setAccountNumber(int number){
        this.accountNumber = number;
    }
    public void setBalance(int number){
        this.balance = number;
    }

    public String getAccountHolder(){
        return this.accountHolder;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public int getBalance(){
        return this.balance;
    }
    public void display(){
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("Balaji");
        bankAccount.setAccountNumber(135434);
        bankAccount.setBalance(4500);
        bankAccount.display();

        // Using the getters to print the values again.
        String name = bankAccount.getAccountHolder();
        int number = bankAccount.getAccountNumber();
        int balance = bankAccount.getBalance();
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + number);
        System.out.println("Balance: " + balance);
    }
}

//Encapsulation is the process of hiding data using private variables and
//accessing or modifying that data through public methods such as getters and setters.

//          Create object
//              ↓
//       BankAccount bankAccount = new BankAccount();
//              ↓
//          Set values
//              ↓
//         setAccountHolder("Balaji")
//         setAccountNumber(135434)
//         setBalance(4500)
//              ↓
//         Values stored inside bankAccount
//              ↓
//         ┌──────────────────────┐
//         │ Balaji               │
//         │ 135434               │
//         │ 4500                 │
//         └──────────────────────┘
//              ↓
//          display()
//              ↓
//          PRINT values