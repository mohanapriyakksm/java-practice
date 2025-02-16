// ip : yhqgz
// op : bktjc


// ASCII a - z => 97 - 122
// A - Z => 65 - 90
public class n2caesarCipher {

    public static String sc(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char deCoded = (char) ((ch - 'a' + 3)%26 + 'a');
            result += deCoded;
        }
        return result;

    }

    public static void main(String[] args) {
        String str = "yhqgz";
        String r = sc(str);
        System.out.println(r);

    }
}
