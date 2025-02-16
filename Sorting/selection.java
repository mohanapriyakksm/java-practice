package Sorting;

import java.util.Scanner;

public class selection{
    static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            int min = i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
    public static void main(String args[]){
        // int[] arr = {13,46,24,52,20,9};
        // int n = arr.length;
        // System.out.println("Before Sorting:");
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to hold the input values
        int[] array = new int[size];

        // Prompt the user to enter array elements
        System.out.println("Enter " + size + " elements:");

        // Loop to get array input
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the array to confirm input
        System.out.println("You entered: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Close the scanner
        scanner.close();
        selectionSort(array);
    }
}