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
class ComplexAddition extends Addition{
    public int add(int[] numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
}
public class HierarchicalInheritance {
    public static void main(String args[]){
        DecimalAddition obj = new DecimalAddition();
        System.out.println(obj.add(1, 9));
        System.out.println(obj.add(1.2, 9.5));
        ComplexAddition obj2 = new ComplexAddition();
        int[] numbers = {1,2,3,5};
        System.out.println(obj2.add(numbers));
    }
}
