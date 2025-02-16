package Patterns;
public class pattern {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(5);
        pattern28(5);
        pattern30(5);
        pattern17(5);
    }

    // 1)
    // * * * * 
    // * * * * 
    // * * * * 
    // * * * * 
    static void pattern1(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 2)
    // *
    // * *
    // * * *
    // * * * *
    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 3)
    // * * * *
    // * * *
    // * *
    // *
    static void pattern3(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 4)
    // 1 
    // 1 2
    // 1 2 3
    // 1 2 3 4    
    static void pattern4(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 5)
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    static void pattern5(int n){
        for(int row=1;row<2*n;row++){
            int totalNoCol = row > n ? 2 * n - row : row;
            for(int col=1; col<=totalNoCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
// 28)
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
    static void pattern28(int n){
        for(int row=1; row<2*n; row++){
            int totalNoCol = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalNoCol;
            for(int i=1;i<=noOfSpaces;i++){
                System.out.print(" ");
            }
            for(int col=1; col<=totalNoCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

//     30)
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5
    static void pattern30(int n){
        for(int row=1; row<=n; row++){
            int spaces = n - row;
            for(int i = 1; i<=spaces; i++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }


    static void pattern17(int n){
        for(int row=1; row<2*n; row++){
            int noOfCols = row > n ? 2 * n - row : row;
            int spaces = n - noOfCols;
            for(int i = 1; i<=spaces; i++){
                System.out.print("  ");
            }
            for(int col=noOfCols;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=noOfCols;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
