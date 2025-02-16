package inheritance;

// First interface for integer addition
interface IntegerAddition {
    int add(int a, int b);
}

// Second interface for decimal addition
interface DecimalAddition {
    double add(double a, double b);
}

// Class implementing both interfaces
class Calculator implements IntegerAddition, DecimalAddition {
    // Implementation of the integer addition method
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    // Implementation of the decimal addition method
    @Override
    public double add(double a, double b) {
        return a + b;
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using the integer addition
        int intSum = calculator.add(5, 10);
        System.out.println("Integer Addition: " + intSum);  // Output: 15

        // Using the decimal addition
        double decimalSum = calculator.add(5.5, 4.5);
        System.out.println("Decimal Addition: " + decimalSum);  // Output: 10.0
    }
}


