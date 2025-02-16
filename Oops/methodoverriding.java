package Oops;

class payment{
    void makePayment(double amt){
        System.out.println("Payment of amount "+amt +" made successfully");
    }
    void thankingMessage(){
        System.out.println("thanks, visit again!");
    }
}

class creditCardPayment extends payment{
    void makePayment(double amt){
        System.out.println("Payment of amount "+amt +" made successfully through cc.");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        creditCardPayment cobj = new creditCardPayment();
            cobj.makePayment(3000);
            cobj.thankingMessage();
    }
}
