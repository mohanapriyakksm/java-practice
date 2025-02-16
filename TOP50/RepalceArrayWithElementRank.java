import java.util.Arrays;
import java.util.Scanner;

public class RepalceArrayWithElementRank {
    static void rank(int[] arr){
        int[] copyArray = Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(copyArray);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<copyArray.length;j++){
                if(arr[i] == copyArray[j]){
                    arr[i] = j+1;
                    break;
                }
            }
        }

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

        rank(arr);

        System.out.print(Arrays.toString(arr));
    }
}
