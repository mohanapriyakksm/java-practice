import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         ArrayList<Integer> temp = new ArrayList<>();
         int left = l, right = m + 1;
         while( left<=m && right<=r){
             if (arr[left] < arr[right]){
                 temp.add(arr[left]);
                 left++;
             }
             else{
                 temp.add(arr[right]);
                 right++;
             }
         }
         while( left<= m ){
             temp.add(arr[left]);
             left++;
         }
         while( right<= r){
             temp.add(arr[right]);
             right++;
         }
         for(int i=l;i<=r;i++){
             arr[i]=temp.get(i-l);
         }
         
         
         
    }
    static void mergeSort(int arr[], int l, int r)
    {
        //code here
        // divide
        if(l >= r) return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numberAsString = input.split(" ");
        int[] arr = new int[numberAsString.length];
        for(int i =0;i<numberAsString.length;i++){
            arr[i]=Integer.parseInt(numberAsString[i]);
        }
        sc.close();
        int n = arr.length;
        int l=0, r = n-1;
        mergeSort(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }
}
