import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(findFactorial(num));
    }
    static int findFactorial(int num){
        if ( num ==0 || num == 1){
            return 1;
        }
        return num * findFactorial(num-1);
    }
}
