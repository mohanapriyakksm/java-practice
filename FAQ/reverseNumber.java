package FAQ;

public class reverseNumber {
    static void reverseNum(int num){
        //get the last digit
        //remove the last digit
        int n = num;
        int reversedNum = 0;
        while(n>0){
            int lastDigit = n % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println(reversedNum);
    }

    public static void main(String[] args) {
        reverseNum(123);
    }
}
