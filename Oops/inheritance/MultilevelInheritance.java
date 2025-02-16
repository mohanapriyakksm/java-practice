package inheritance;
class Addition{
    public int add(int a, int b){
        return a+b;
    }
}
class DecimalAddition extends Addition{
    public double add(double a, double b){
        return a + b;
    }
}
class ComplexAddition extends DecimalAddition{
    public int add(int[] numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
}
public class MultilevelInheritance {
    public static void main(String args[]){
        ComplexAddition obj = new ComplexAddition();
        System.out.println(obj.add(1, 9));
        System.out.println(obj.add(1.2, 9.5));
        int[] numbers = {1,2,3,4};
        System.out.println(obj.add(numbers));
    }
}
