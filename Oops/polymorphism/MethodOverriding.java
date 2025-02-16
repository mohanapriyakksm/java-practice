package polymorphism;

class PaymentProcessing{
    public void processPayment(double amt){
        System.out.println("processing payment of amount"+amt);
    }
}

class CreditcardPP{
    public void processPayment(double amt){
        System.out.println("processing creditcard payment of amount:"+amt);
    }
}

public class MethodOverriding {
    public static void main(String args[]){
        CreditcardPP cc = new CreditcardPP();
        PaymentProcessing pp = new PaymentProcessing();
        cc.processPayment(199);
        pp.processPayment(299);
    }
}
