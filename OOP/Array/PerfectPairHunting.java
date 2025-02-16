package Array;

import java.util.Scanner;

public class PerfectPairHunting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] matrix = new int[m][n];
        for(int i = 0; i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        scan.close();
        int[] perfectMatch = qualityCount(matrix, m, n);
        for(int e:perfectMatch){
            System.out.print(e+" ");
        }
    }

    public static int[] qualityCount(int[][] matrix,int m, int n){
        int highestCount = 0;
        int hrow = -1;
        int hcol = -1;
            for(int i=0;i<m;i++){
                for(int j=0; j<n;j++){
                    if(matrix[i][j]==0) continue;
                    int currentCount = checkCount(i,j, matrix);
                    if(currentCount > highestCount){
                        highestCount = currentCount;
                        hrow=i;
                        hcol=j;
                    }
                }

            }
            return new int[] {hrow,hcol};


    }

    public static int checkCount(int row, int col, int[][] matrix){
        
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int startRow = Math.max(0,row-1);
        int endRow = Math.min(row+1,numRows-1);
        int startCol = Math.max(0,col-1);
        int endCol = Math.min(col+1,numCols-1);
        int count = 0;

        for(int r = startRow; r<=endRow; r++){
            for(int c = startCol; c <= endCol; c++){
                if(!(r==row && c==col)){
                    if(matrix[r][c] == 1){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

