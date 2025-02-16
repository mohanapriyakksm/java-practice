package Recursion;


import java.util.Scanner;

public class Recursion {
    static int fact(int n){
        if (n == 0){  // Base case -> to stop infinite recursion
            return 1;
        } else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num =  scan.nextInt();
        System.out.println("Factorial of "+num +" is "+fact(num));
        scan.close();
    }
}
