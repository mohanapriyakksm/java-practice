import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        sc.close();
        int year = sc.nextInt();
        if(year%400==0) System.out.print("Leap year");
        else if(year%4==0 && year%100 != 0) System.out.print("Leap year");
        else System.out.print("Not Leap year");
    }
}
