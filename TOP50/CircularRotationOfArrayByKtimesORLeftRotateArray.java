import java.util.Arrays;
import java.util.Scanner;

public class CircularRotationOfArrayByKtimesORLeftRotateArray {
    static void rotateArr(int arr[], int d, int n)
    {
        d=d%n;  // to avoid same rotation again
        reverse(arr,0,d-1);// Reverse the first K elements
        reverse(arr,d,n-1);// Reverse the remaining elements
        reverse(arr,0,n-1); // Reverse the entire row
    }
    
     public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int k = sc.nextInt();
        String[] numberAsString = input.split(" ");
        int[] arr = new int[numberAsString.length];
        for(int i =0;i<numberAsString.length;i++){
            arr[i]=Integer.parseInt(numberAsString[i]);
        }
        sc.close();
        int n = arr.length;
        rotateArr(arr,k,n);
        System.out.println(Arrays.toString(arr));

        }

    
}
