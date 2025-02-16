package Sorting;

public class bubble {
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0; j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String args[]){
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr); 
        
    }
}
