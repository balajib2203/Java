package Keywords;

class InvalidProductException extends Exception {
    public InvalidProductException(String message){
        super(message);
    }
}
class InsufficientStockException extends Exception {
    public InsufficientStockException(String message){
        super(message);
    }
}
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message){
        super(message);
    }
}

class online {
    static void name(String product, int prod) throws InvalidProductException {
        if (prod == 0 || product.length() == 0) { //// both should be >=1 to get in else loop, or else always invalid
            throw new InvalidProductException("Product name is invalid");
        } else {
            System.out.println("Product name is valid");
        }
    }

    static void quantity(int q) throws InvalidQuantityException {
        if (q <= 0) {
            throw new InvalidQuantityException("Out of quantity");
        } else {
            System.out.println("Quantity is valid");
        }
    }

    static void stock(int q, int stock) throws InsufficientStockException {
        if (q > stock) {
            throw new InsufficientStockException("Out of stock");
        }
        else{
            System.out.println("Stock is valid");
        }
    }
}



public class User_Shopping {
    static void main(String[] args) {
        try{
            online.name("",1);
        }
        catch(InvalidProductException e){
            System.out.println(e.getMessage());
        }
        try {
            online.quantity(0);
        }
        catch(InvalidQuantityException e){
            System.out.println(e.getMessage());
        }
        try {
            online.stock(5000,500);
        }
        catch(InsufficientStockException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Order process completed");
        }
    }
}
