package FAQ;

public class sumOfNaturalNumbers {
    static int sumOfNN(int  n){
        if(n==0){
            return 0;
        }else{
            return n + sumOfNN(n-1);
        }
    }

    public static void main(String[] args) {
        int num =15;
        System.out.println("Sum of NN till 15 is: "+sumOfNN(num));
    }
    
}
