package Searching;

public class binary {
    static int binarySearch(int[] arr,int searchElement){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==searchElement){
                return mid;
            }
            else if(searchElement > arr[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {34,56,78,89,98,123,245,789,999};
        int target = 98;
        System.out.println(binary.binarySearch(arr,target));

    }
}


