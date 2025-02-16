import java.util.Scanner;
public class reverse_of_number
{
  public static void main(String[] args)
  {
    //scanner class declaration
    Scanner sc = new Scanner(System.in);

    //input from user
    System.out.print("Enter a number : ");
    int number = sc.nextInt();
    System.out.print("Reverse of " + number + " is ");

    // handle negative integer
    int actual_number = number;
    boolean isNegative = number < 0;
    number = Math.abs(number);
    

    int reverse = 0;
    String s = "";
    while (number != 0)
    {
     int pick_last = number % 10;

      //use function to convert pick_last from integer to string
      s = s + Integer.toString(pick_last);
      number = number / 10;
    }

    //display the reversed number
    reverse = Integer.parseInt(s);  // string to integer
    if(isNegative){
      reverse *= -1;
    }
    System.out.println(reverse);
    if(actual_number==reverse){
      System.out.println("the given number is palindrome");
    }
    sc.close();
  }

}