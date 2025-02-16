package FAQ;

public class smallestNumber {
    static int smallestNo(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {87,65,13,45,84,22};
        System.out.println("Smallest no. in arr is: "+smallestNo(arr));
    }
}
