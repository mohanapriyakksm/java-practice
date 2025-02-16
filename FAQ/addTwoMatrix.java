package FAQ;

import java.util.Arrays;

public class addTwoMatrix {
    static int[][] addMatrix(int[][] arr1,int[][] arr2){
        int[][] sum = new int[arr1.length][arr1[0].length];

        for(int row=0;row<arr1.length;row++){
            for(int col=0;col<arr1[0].length;col++){
                sum[row][col] = arr1[row][col] + arr2[row][col];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int[][] arr2 = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int[][] result = addMatrix(arr1, arr2);

        for(int row=0;row<result.length;row++){
            for(int col=0;col<result[0].length;col++){
                System.out.print(result[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(result));
        
    }
}
