package FAQ;
import java.util.*;
public class bubbleSort {
    static int[] bubble(int[] arr, int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0; j<i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] array = {12,45,23,56,26,98};
        System.out.println("Before sorting:"+ Arrays.toString(array));
        bubble(array, array.length);
        System.out.println("After sorting:"+ Arrays.toString(array));

    }
}
