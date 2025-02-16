package FAQ;

public class factorial {
    static void fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }

        System.out.println("fact of " +n + " is "+fact);
    }

    static int recFact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n * recFact(n-1);
    }

    public static void main(String[] args) {
        fact(5);
        System.out.println("recursive fact:"+recFact(5));
    }
}
