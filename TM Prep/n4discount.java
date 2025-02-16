public class n4discount {

    public static int discountCalc(int n,int[] arr,int a){
        int count = 0;
        for(int i=0;i<n;i++){
            if(a%Math.abs(arr[i]) == 0){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        // int n = 7;
        // int[] arr= {9,-13,8,-7,-8,18,10};
        // int a = 18;
        // int r = discountCalc(n,arr,a);
        // System.out.println(r);

        int n = 5;
        int[] arr = {10, 20, -30, 40, 50};
        int a = 10;
        int r = discountCalc(n,arr,a);
        System.out.println(r);

        
    }
}
