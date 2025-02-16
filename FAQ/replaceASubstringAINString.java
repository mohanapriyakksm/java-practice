package FAQ;

class replaceASubstringAInString {
    static void replaceSubstring(String str, String oldSubString, String newSubsString){
        StringBuffer result = new StringBuffer();
        int l = str.length();
        int oldssl = oldSubString.length();
        int i = 0;
        while(i<=l-oldssl){
            if(str.substring(i,i+oldssl).equals(oldSubString)){
                result.append((newSubsString));
                i = i+oldssl;
            }
            else{
                result.append(str.charAt(i));
                i++;
            }
        }
        result.append(str.substring(i));
        System.out.println(result);

    }

    public static void main(String[] args) {
        String str = "Hello World, Welcome to Java!";
        String oldSubstring = "World";
        String newSubstring = "Universe";

        // Call the method to manually replace the substring
        replaceSubstring(str, oldSubstring, newSubstring);
    }
}
