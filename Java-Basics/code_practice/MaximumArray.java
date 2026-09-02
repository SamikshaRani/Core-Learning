import java.util.Scanner;

public class MaximumArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of elements to be entered in the Array: ");
        int n = in.nextInt();
        
        int[] arr = new int[n];

        System.out.print("Enter the elements one by one: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Do you want to print the maximum of the whole array or between a range of indices inside the array? \n 1. Range \n 2. Whole Array");
        System.out.print("Enter your choice number: ");
        int ch = in.nextInt();

        if (ch == 1) {

            System.out.print("Enter the starting index: ");
            int start = in.nextInt();
            System.out.print("Enter the ending index: ");
            int end = in.nextInt();

            System.out.println("The maximum of numbers in the required range is: " + maxRange(arr, start, end));
            System.out.println("If the result comes out to be -1 without any such entrance, work on edge case appeared, try again!");
        }

        else if (ch == 2) {
            System.out.println("The maximum of all the numbers in the given Array is: " + max(arr));
            System.out.println("If the result comes out to be -1 without any such entrance, work on edge case appeared, try again!");
        }

        else {
            System.out.println("Invalid choice!");
        }

        in.close();
    }
    static int maxRange(int[] arr, int start, int end) {

        if (start > end) {         //work on edge here, like array being null
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int max(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i ++){

            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
}

