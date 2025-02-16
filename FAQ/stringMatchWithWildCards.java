package FAQ;

public class stringMatchWithWildCards {
    static boolean stringmatch(String str1, String str2){
        String s1 = str1.replaceAll("[^a-z]","").toLowerCase();
        String s2 = str2.replaceAll("[^a-z]","").toLowerCase();
        
        return s1.equals(s2)? true : false;
    }

    public static void main(String[] args) {
        if(stringmatch("hey@3() you", "h67&& ey you{}")){
            System.out.println("string matches");
        }else{
            System.out.println("String does not match");
        }
    }
}
