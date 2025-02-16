package Searching;

public class linear {
    static int linearSearch(int[] arr, int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {34,56,78,89,98,123,245,789,999};
        int target = 98;
        System.out.println(linearSearch(arr,target));
    }
    
}
