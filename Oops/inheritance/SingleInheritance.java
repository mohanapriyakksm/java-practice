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
public class SingleInheritance{
    public static void main(String args[]){
        DecimalAddition obj = new DecimalAddition();
        System.out.println(obj.add(1, 9));
        System.out.println(obj.add(1.2, 9.5));
    }
}