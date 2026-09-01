package Keywords;

class userdefined extends Exception{
    userdefined(String str){
        super(str);
    }
}

public class User {
    static void check(int age) throws userdefined{
        if(age < 18){
            throw new userdefined("Age invalid");
        }
        else {
            throw new ArithmeticException("You are eligible");
        }
    }
    public static void main(String[] args) {
        try{
            check(19);
        }
        catch(userdefined e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Hello world");
    }

}

//check(19)
//    ↓
//19 < 18?
//    ↓
//  false
//    ↓
//else
//    ↓
//throw ArithmeticException
//    ↓
//catch(ArithmeticException e)
//    ↓
//print exception
//    ↓
//Hello world