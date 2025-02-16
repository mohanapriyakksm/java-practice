package FAQ;

public class rotaionOf1dArray {
    // reverse
    static void reverse(int[] arr,int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateAntiClock(int[] arr, int k){
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    static void rotateClock(int[] arr, int k){
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-k-1);
        reverse(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        rotateAntiClock(arr, k);
        System.out.println("Anti clock wise");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int[] arr2 = {1,2,3,4,5};
        int k2 = 2;
        rotateClock(arr2, k2);
        System.out.println("clock wise:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    
}
