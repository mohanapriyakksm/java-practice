import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binarynumber = sc.nextInt();
        sc.close();
        System.out.println("the decimal value of "+binarynumber+ " is "+ toDecimal(binarynumber));
    }

    static int toDecimal(int num){
        int sum = 0, digit;
        int n = 0;
        while(num != 0 ){
            digit = num % 10;
            sum += digit * (int) Math.pow(2,n);
            n++;
            num = num/10;

        }
        return sum;

    }
}
