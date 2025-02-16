// ip : int : 578378923
// op : 3
import java.util.HashMap;

public class n1securityKey{

    public static int secKey(int data){
        HashMap<Character, Integer> map = new HashMap<>();
        String num = String.valueOf(data);
        for(int i=0;i<num.length();i++){
            char digit = num.charAt(i);
            map.put(digit,map.getOrDefault(digit,0)+1);
        }

        int count = 0;
        for(Character key : map.keySet()){
            if(map.get(key) > 1){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        int d = 578378923;
        int secK = secKey(d);
        System.out.print("data: "+ d + " Secret Key: "+secK);
    }
}