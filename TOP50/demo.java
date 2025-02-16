import java.util.ArrayList;

class Demo
{
    // Function to check if n is palindrome
    static ArrayList<Integer> isPalindrome(int[] arr,int n)
    {
        @SuppressWarnings({ "rawtypes", "unchecked" })
        ArrayList<Integer> newarr = new ArrayList();

        for (int element : arr) {
            int number = element;
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
    if(element == reverse){
        newarr.add(element);
    }
        }
        return newarr;
    }   
    // Function to find the largest palindromic number
    static int largestPalindrome(ArrayList<Integer> arr)
    {
        int max = 0;
         for (Integer integer : arr) {
            if(integer>max){
                max=integer;
            }
         }
         return max;
     }

    // Driver program
    public static void main(String []args)
    {
       int []A = { 121, 2322, 54545, 999990 };
       int n = A.length;
       ArrayList<Integer> arr = isPalindrome(A, n);
       System.out.println(largestPalindrome(arr));
       

      // print required answer
      
    }

}