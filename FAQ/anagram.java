package FAQ;
import java.util.*;
public class anagram {

    static boolean isAnagram(String str1, String str2){

        //remove white spaces and convert all the letters to lowercase
        String s1 = str1.replaceAll("[\\s]","").toLowerCase();
        String s2 = str2.replaceAll("[\\s]","").toLowerCase();
        

        if(s1.length() != s2.length()){
            return false;
        }
        //place all the char of string in char array
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        //sort char arr
        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.equals(a1, a2)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        if(isAnagram("silent", "listen")){
            System.out.println("is Anagram");
        }else{
            System.out.println("Not anagram");
        }
    }
    
}
