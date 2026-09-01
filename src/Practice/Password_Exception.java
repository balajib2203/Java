package Practice;

class InvalidPasswordException extends Exception {

    InvalidPasswordException(String message) {
        super(message);
    }
}
class password {
    static void checkPassword(String password) throws InvalidPasswordException {
        if (password.length() < 4) {
            throw new InvalidPasswordException("Password is too short");
        } else {
            System.out.println("Password is valid");
        }
    }
}

public class Password_Exception {
    public static void main(String[] args) {

        try{
            password.checkPassword("123");
        }
        catch (Exception e){
            System.out.println(e);
        }
    finally {
            System.out.println("Program continues");
        }
    }
}
