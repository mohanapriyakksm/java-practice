package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][2];
        //Input
        for(int row=0;row<arr.length;row++){
            for(int col=0; col<arr[row].length;col++ ){
                arr[row][col]= scan.nextInt();
            }
        }
        //Output
        for(int row=0;row<arr.length;row++){
            for(int col=0; col<arr[row].length;col++ ){
                System.out.print(arr[row][col]+" ") ;
            }
            System.out.println();
        }

        for(int row=0; row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        for(int[] a:arr){
        System.out.println(Arrays.toString(a));
        }
        scan.close();

        int[][] arr2d = {
            {1,2,3},
            {4,5},
            {6,7,8}
        };
       
        for(int[] a:arr2d){
            System.out.println(Arrays.toString(a));
            }
    }
    
}
