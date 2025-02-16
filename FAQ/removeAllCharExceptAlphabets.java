package FAQ;

public class removeAllCharExceptAlphabets {
    public static void main(String[] args) {
        String str = "hey^&8376Nigga%4**>+";
        String strAns = str.replaceAll("[^a-zA-Z]","");
        System.out.println("Before replacement:"+str);
        System.out.println("Before replacement:"+strAns);
    }
}
