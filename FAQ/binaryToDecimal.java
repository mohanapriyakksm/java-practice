package FAQ;

public class binaryToDecimal {
    static void decimal(String input){
        String num= input;
        int sum = 0;
        int pow = 0;
        for(int i=num.length()-1;i>=0;i--){
            int lastNum = num.charAt(i) - '0';   // char((which is in number) to int ( - '0' )
            sum += lastNum *(int) Math.pow(2,pow);
            pow++;
        }

        System.out.println("Decimal of "+input+ " is "+sum);
    }

    public static void main(String[] args) {
        String num= "01011";
        decimal(num);
    }
}
