import java.util.*;
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int len = order(num);
        System.out.println(amstrong(num,len));

    }

    static int order(int num){
        int len=0;
        while ( num != 0){
            len++;
            num /= 10;

        }
        return len;
    }

    static boolean amstrong(int num, int len){
        int sum =0, digit, temp;
        temp = num;
        while( temp != 0 ){
            digit = temp % 10;
            sum = sum + (int) Math.pow(digit,len);
            temp = temp / 10;
        }
        return num == sum;
    }
}
