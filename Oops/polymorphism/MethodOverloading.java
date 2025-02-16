package polymorphism;

class Calculate{
    static int Multiply(int a, int b){
        return a * b;
    }

    static double Multiply(double a, double b){
        return a*b;
    }
}

public class MethodOverloading {
    public static void main(String args[]){
        System.out.println("Multiplication of two int:"+Calculate.Multiply(2,7));
        System.out.println("Multiplication of two double:"+Calculate.Multiply(2.3,7.6));
    }
}
