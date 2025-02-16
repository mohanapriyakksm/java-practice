import java.util.Scanner;

public class SmallestElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numberAsString = input.split(" ");
        int[] arr = new int[numberAsString.length];
        for(int i =0;i<numberAsString.length;i++){
            arr[i]=Integer.parseInt(numberAsString[i]);
        }
        sc.close();

        int min = arr[0];
        for(int i =1; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("min:"+min);
    }
}
