import java.util.Scanner;
import java.util.Arrays;

public class SwapReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of elements to be entered in the array: ");
        int n = in.nextInt();

        System.out.print("Enter the numbers one by one into the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        //swap(arr, 0, 4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        in.close();
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
