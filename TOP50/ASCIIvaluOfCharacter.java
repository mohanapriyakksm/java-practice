import java.util.Scanner;

public class ASCIIvaluOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        char ch = sc.next().charAt(0);
        sc.close();
        int i = ch; // auto typecasting
        System.out.println("ASCII value of "+ch+" is "+i);
    }
}
