package FAQ;
import java.util.*;

public class replaceArrayByRank {
    static void replaceByRank(int[] arr){
        int[] newArr = Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(newArr);
        //replace by index
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<newArr.length;j++){
                if(arr[i] == newArr[j]){
                    arr[i] = j+1;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {29,56,36,69,42,1};  // {1,29,36,42,56,69}
        replaceByRank(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
