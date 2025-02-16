package FAQ;

public class palindrome {
    static boolean isPalindrome(String str){
        String string = "";
        for(int i=str.length()-1;i>=0;i--){
            string += str.charAt(i);
        }

        return str.equals(string) ? true : false;
    }

    static boolean isPalindromeNumber(int num){
        String str = String.valueOf(num);
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }

        if(Integer.valueOf(rev) == num){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        if(isPalindrome("madam")){
            System.out.println("is Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

        System.out.println(isPalindromeNumber(104));
    }
    
}
