import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows for the array: ");
        int row = in.nextInt();
        System.out.print("Enter the number of coloumns for array: ");
        int col = in.nextInt();

        int[][] arr = new int[row][col];
        // System.out.println(arr.length); //prints number of rows

        //input
        System.out.println("Enter the elements one by one (row number stated): ");
        for(int r = 0; r < arr.length; r++) {
            System.out.print("Enter elements for row " + (r+1) + ": ");
            for (int c = 0; c < arr[r].length; c++) {  //for each column in every row
                arr[r][c] = in.nextInt();
            }
        }

        //output
        // for(int r = 0; r < arr.length; r++) {
        //     for (int c = 0; c < arr[r].length; c++) {  //for each column in every row
        //          System.err.print(arr[r][c] + " ");
        //     }
        //     System.out.println();
        // }

        // for (int r = 0; r < arr.length; r++) {
        //     System.out.println(Arrays.toString(arr[r]));
        // }

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        in.close();
    }
}
