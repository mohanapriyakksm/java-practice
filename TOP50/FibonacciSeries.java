public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 15;
       int a=0, b=1;
       System.out.print(a+","+b+",");
       int nextterm;
       int sum=1;
       for(int i=2;i<n;i++){
           nextterm = a+b;
           sum+=nextterm;
           a=b;
           b=nextterm;
           System.out.print(nextterm+",");
       }
       System.out.println();
       System.out.println("Sum of fib series is:"+sum);
       System.out.print("Nth fibonacci number:"+nthfib(n));
    }
    // nth fibonacci number --> recursion

   static int nthfib(int n){
    if(n==0 || n==1){
        return n;
    }
    return nthfib(n-1)+nthfib(n-2);
   }
}


