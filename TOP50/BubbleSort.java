import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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
        doBubbleSort(arr,n);

        }

        static void doBubbleSort(int[] arr,int n){
            for( int i = n-1; i>=1; i--){
                int didswap = 0;
                for(int j=0; j<=i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        didswap=1;
                    }
                }
                if ( didswap==0){
                    break;
                }

            }

            //print sorted array
            System.out.println("Sorted Array: " +Arrays.toString(arr));

        }
        
    }
    

