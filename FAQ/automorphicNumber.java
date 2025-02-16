package FAQ;


// can find using substring -> squarenumber.substring(squarenumber.length() - number.length());
public class automorphicNumber {
    static void automorphic(int num){
        String number = String.valueOf(num);  // 25 l=2
        String squarenumber = String.valueOf(num * num); //625 l=3
        String lastDigit = "";
        for(int i=squarenumber.length()-number.length();i<squarenumber.length();i++){
            char last = squarenumber.charAt(i);
            lastDigit += last;
        }
        if(lastDigit.equals(number)){
            System.out.println(num + " is a Automorphic number!");
        }else{
            System.out.println(num + " is not a Automorphic number!");
        }

    }

    public static void main(String[] args) {
        automorphic(205);
    }
}
