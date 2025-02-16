package FAQ;

public class nonRepeatingCharInString {
    static void nonRepeating(String str){
        String s = str.replaceAll("[\\s]","").toLowerCase();

        int[] freq = new int[256];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }

        System.out.println("char without repetition:");

        for(int i=0;i<256;i++){
            if(freq[i] == 1){
                System.out.print((char) i + " ");
            }
        }
    }

    public static void main(String[] args) {
        nonRepeating("Mohana Priya Is Not A Human");
    }
    
}
