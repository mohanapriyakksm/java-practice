package FAQ;

public class asciiValueOfChar {
    static void asciiValue(char ch){
        int asciivalue = ch; // typecasting
        System.out.println("ASCII value of " +ch +" is "+asciivalue);
    }

    public static void main(String[] args) {
        char ch = 'a';
        asciiValue(ch);
    }
}
