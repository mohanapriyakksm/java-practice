// ip : 10
// op : 2#1#3

// ip : 15
// op: 4#0#3

// Given Integer N, we need to find Following: 
// 1. Total number of Set Bits in N. 
// 2. Position of Least significant set bit. 
// 3. Position of Most Significant Set Bit.

// The Output should be in String form a#b#c 
// Where a, b and c are respective 1, 2 and 3 queries.

public class n3binary {
    
    public static String binaryManipulate(int num){
        StringBuilder binary = new StringBuilder();

        while(num > 0){
            binary.append(num % 2);
            num /= 2;
        }

        String str = binary.reverse().toString();

        int setBitsCount = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                setBitsCount++;
            }
        }

        int leastSigbitLoc = -1;  //1010 --> 2 --> 1
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) == '1'){
                leastSigbitLoc = str.length()-1-i;
                break;
            }
        }

        int mostSigbitLoc = -1; //1010 -->0 -->3
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                mostSigbitLoc = str.length()-1-i;
                break;
            }
        }

        String result = String.valueOf(setBitsCount) + "#" + String.valueOf(leastSigbitLoc) + "#" + String.valueOf(mostSigbitLoc);
        return result;
    }

    public static void main(String[] args) {
        int i = 15;
        String r = binaryManipulate(i);
        System.out.println(r);
    }
}
