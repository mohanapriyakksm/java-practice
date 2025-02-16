package FAQ;

public class leapyear {
    static boolean isleapYear(int yr){
        if(yr%400==0){ // century year
            return true;
        }
        else if(yr%4==0 && yr%100 != 0){  // non century year
            return true;
        }
        else{
            return false;
        }
    }

    // A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
    // A leap year (except a century year) can be identified if it is exactly divisible by 4.
    // A century year should be divisible by 4 and 100 both.
    // A non-century year should be divisible only by 4.

    public static void main(String[] args) {
        if(isleapYear(2019)){
            System.out.println("is leap year!");
        }else{
            System.err.println("not a leap year!");
        }
    }
}
