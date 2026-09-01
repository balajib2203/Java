package Practice;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class InvalidAccountException extends Exception {
    InvalidAccountException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class ATM {
    static void checkBalance(int balance, int amount) throws InsufficientBalanceException {
        if (balance<amount) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        else{
            System.out.println("Balance is "+balance);
        }
    }
    static void checkAmount(int Amount) throws InvalidAmountException {
        if (Amount <= 0) {
            throw new InvalidAmountException("Invalid Amount");
        }
    }
    static void checkAccount(String Account) throws InvalidAccountException{
        if (Account.length() < 5) {
            throw new InvalidAccountException("Invalid Account");
        }
    }
}


public class Bank_Exception {
    public static void main(String[] args) {
//        try {
//            ATM.checkAccount("045546");
//            ATM.checkAmount(9);
//            ATM.checkBalance(5000,7000);
//        }
//        catch (InvalidAccountException E){
//            System.out.println(E);
//        }
//        catch (InvalidAmountException F){
//            System.out.println(F);
//        }
//        catch (InsufficientBalanceException G){
//            System.out.println(G);
//        }
//        finally {
//            System.out.println("Please take your card");
        try {
            ATM.checkAccount("045");
        }
        catch (InvalidAccountException e) {
            System.out.println(e);
        }

        try {
            ATM.checkAmount(-9);
        }
        catch (InvalidAmountException e) {
            System.out.println(e);
        }

        try {
            ATM.checkBalance(5000, 7000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
        }
    }

