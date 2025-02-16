package FAQ;

import java.util.HashMap;

public class frequencyOfCharInString {
    static void frequency(String str){
        String string = str.replaceAll("[\\s]","").toLowerCase();

        HashMap<Character,Integer> freqMap = new HashMap<>();

        for(char c : string.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }

        System.out.println(freqMap);
    }

    public static void main(String[] args) {
        frequency("a bb ccc dddd");
    }
}
