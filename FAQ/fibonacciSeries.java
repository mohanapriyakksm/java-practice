package FAQ;

// print fibonacci series upto Nth number
// fibonacci series - > 0,1,1,2,3,5,8,13,...
public class fibonacciSeries {

    static void fibonacci(int n){
        // always store the first 2 digits of fibonacci
        int a = 0;
        int b = 1;
        System.out.print(a +","+ b + ",");
        int i = 2;
        while(i<n){
            int nextTerm = a+b;
            System.out.print(nextTerm+",");
            a = b;
            b = nextTerm;
            i++;
        }

    }

    public static void main(String[] args) {
        fibonacci(5);
    }


}
