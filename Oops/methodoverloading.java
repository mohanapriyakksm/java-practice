package Oops;

class addition{
    static int add(int n1,int n2){
        return n1 + n2;
    }

    static double add(double n1, double n2){
        return n1 + n2;
    }

}


public class methodoverloading {
    public static void main(String[] args) {
        System.out.println(addition.add(3,4));
        System.out.println(addition.add(3.3,4.2));
    }
}
