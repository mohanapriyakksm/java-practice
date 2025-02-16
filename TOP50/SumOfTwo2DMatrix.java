import java.util.*;
public class SumOfTwo2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        System.out.println("Enter matrix1:");
        int[][] mat1 = inputmatrix(rows,columns,sc);
        System.out.println("Enter matrix2:");
        int[][] mat2 = inputmatrix(rows,columns,sc);

        int[][] sumMat = sumOfMat(mat1,mat2);
        displayResultMat(sumMat);
    }

    static int[][] inputmatrix(int r, int c, Scanner sc){
        int[][] mat = new int[r][c];
        for(int i=0;i<r;i++){
            for(int  j=0; j<c; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;

    }

    static int[][] sumOfMat(int[][] mat1, int[][] mat2){
        int[][] newMat = new int[mat1.length][mat1[0].length];
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                newMat[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return newMat;

    }

    static void displayResultMat(int[][] sumMat){
        for (int[] row : sumMat) {
            for (int e : row) {
                System.out.print(e+" ");
                
            }
            System.out.println();
            
        }
    }
}
