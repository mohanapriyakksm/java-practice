package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    static long fib(int n){
        if(n<=1){
            return n;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for(int i=0 ; i<number; i++){
            System.out.print(fib(i)+" ");

        }
        // System.out.println(fib(number));
        scan.close();



    }
}
