package Recursion;

public class numbers {
    public static void main(String[] args) {
        fun();
    }
    static int count =0;
    public static void fun(){
        if(count == 3 ) return;
        System.out.println(count);
        count++;
        fun();

    }
}
