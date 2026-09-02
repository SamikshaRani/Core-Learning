import java.util.Arrays;
import java.util.Scanner;

public class InputOutputArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of elemnts to be entered in the array: ");
        int n = in.nextInt();

        // arrays of primitives
        int[] arr = new int[n];
        System.out.print("Enter the specified number of elements one by one: ");

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < n; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // for (int num : arr) { //for evrey elemnt in array, print the element
        //     System.out.print(num + " "); //here num represents elemnts of the array
        // }

        // System.out.println(arr[5]);

        // arrays of objects
        System.out.print("Enter the specified number of elements one by one: ");

        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) { //.length is the method for length for calculation of length of arrays
            str[i] = in.next();
        } 

        System.out.println(Arrays.toString(str));

        //modify
        System.out.println("Modifying a bit... ");
        str[1] = "sam";
        System.out.println(Arrays.toString(str));

        in.close();
    }
}
