package FAQ;

// n = 153
// n=3 (it has 3 digits).
// 1^3 + 5^3 + 3^3 =1+125+27=153.
// So, 153 is an Armstrong number.

public class amstrongNumber {
    static int isAmstrong(int num, int len){
        int sum = 0;
        int n = num;
        while(n != 0){
            int lastDigit = n % 10;
            sum = sum + (int) Math.pow(lastDigit, len);
            n= n/10;
        }
        return sum;
    }

    static int order(int num){
        int len = 0;
        while ((num != 0)) {
            len++;
            num = num / 10;
        }
        return len;
    }

    public static void main(String[] args) {
        int num = 153;
        int len = order(num);
        if(num == isAmstrong(153, len)){
            System.out.println(num +" is amstrong number");
        }else{
            System.out.println(num +" is not amstrong number");
        }
    }
    
}
