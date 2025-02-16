package Oops;

abstract class payment{  // acts as general interface for user
    abstract void makePayment(double amt);
    void thankingMessage(){
        System.out.println("thanks, visit again!");
    }
}

class creditCardPayment extends payment{
    void makePayment(double amt){
        System.out.println("Payment of amount "+amt +" made successfully through cc.");
    }
}

public class abstraction {
    public static void main(String[] args) {
        creditCardPayment cobj = new creditCardPayment();
        cobj.makePayment(3000);
        cobj.thankingMessage();
    }
}


// Define the Payment interface


// interface Payment {
//     void makePayment(double amount);
// }

// // Implement the interface in a class for credit card payments
// class CreditCardPayment implements Payment {
//     @Override
//     public void makePayment(double amount) {
//         System.out.println("Payment of " + amount + " made using Credit Card.");
//     }
// }

// // Implement the interface in a class for mobile wallet payments
// class MobileWalletPayment implements Payment {
//     @Override
//     public void makePayment(double amount) {
//         System.out.println("Payment of " + amount + " made using Mobile Wallet.");
//     }
// }

// // Main class to demonstrate abstraction
// public class AbstractionExample {
//     public static void main(String[] args) {
//         // Create an object for Credit Card Payment
//         Payment payment1 = new CreditCardPayment();
//         payment1.makePayment(5000);

//         // Create an object for Mobile Wallet Payment
//         Payment payment2 = new MobileWalletPayment();
//         payment2.makePayment(2500);
//     }
// }
