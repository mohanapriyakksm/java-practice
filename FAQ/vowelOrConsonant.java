package FAQ;
import java.util.*;
public class vowelOrConsonant {
    
    static boolean vORc(char ch){
        char[] vowels = {'a','e','i','o','u'};
        boolean isVowel = false;
        for(char vowel : vowels){
            if(ch == vowel){
                isVowel = true;
                return isVowel;
            }
        }
        return isVowel;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);
        sc.close();
        if(vORc(ch)){
            System.out.println(ch+" is vowel");
        }else{
            System.out.println(ch + " is consonant");
        }
    }
    
}
