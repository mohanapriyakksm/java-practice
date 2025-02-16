package FAQ;

public class primeNNumber {
    static boolean isPrime(int n){
        if(n<2){return false;}

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){return false;}
        }

        return true;
    }

    static void printNprimeNumbers(int n){
        int count = 0;
        int num = 2;

        while(count<n){
            if(isPrime(num)){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }

    public static void main(String args[]){
        printNprimeNumbers(5);
    }
}
