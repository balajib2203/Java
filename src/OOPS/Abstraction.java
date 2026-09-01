package OOPS;

abstract class payment{
    abstract void makePayment();
    void paymentSuccess() {
        System.out.println("Payment successful");
    }
}

class creditcard extends payment{
    @Override
    void makePayment() {
        System.out.println("Payment using Credit card");
    }
}
class upi extends payment {
    @Override
    void makePayment() {
        System.out.println("Payment using upi");
    }
}
    public class Abstraction {
        public static void main(String[] args) {
            creditcard c = new creditcard();
            c.makePayment();
            c.paymentSuccess();
            upi u = new upi();
            u.makePayment();
            u.paymentSuccess();
        }
    }

//Abstraction means hiding implementation details and showing only the essential functionality.

//           Payment
//              ↓
//"Every payment MUST have makePayment()"
//              ↓
//       ┌──────────────┐
//       ↓              ↓
//    CreditCard       UPI
//       ↓              ↓
//  Credit Card        UPI
//  payment      -      payment