package Array;

public class MatrixSearch {

    public static void main(String[] args) {
        int[][] mat = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int X = 37;
        System.out.println(searchInSortedMatrix(mat, X));
    }

    public static int searchInSortedMatrix(int[][] mat, int X) {
        
        for (int i = 0; i < mat.length; i++) {
            if((X >= mat[i][0]) && (X <= mat[i][mat[i].length - 1])) {
                if(binarySearch(mat[i], X)) return 1 ;
            }
        }
        return 0;
    }

public static boolean binarySearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();

    while (low <= high) {
        int mid = (low + high) / 2;
        
        System.out.println("low: " + low + ", high: " + high + ", mid: " + mid);
        System.out.println(target);
        if (arr[mid] == target) {
            return true; 
        } else if (target > arr[mid]) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return false; 
}

}