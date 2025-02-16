package varargs;

public class varargs {

    static int minnum(int... vals){
        int min =  Integer.MAX_VALUE;
        for(int k:vals){
            if(k<min){
                min = k;
            }
        }
        return min;

    }
    public static void main(String[] args) {
        System.out.println(minnum(1,2,4,6,78));
        
    }

}
