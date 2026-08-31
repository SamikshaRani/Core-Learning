import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int n1 = in.nextInt();
        System.out.print("Enter Second number: ");
        int n2 = in.nextInt();

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("The numbers after swapping are: " + n1 + " and " + n2);

        in.close();
    }
    // static void swap(int num1, int num2) {
    //     num1 = num1 + num2;
    //     num2 = num1 - num2;
    //     num1 = num1- num2;
    // } this fuction will only change the values of num1 and num2 in the function scope, but not in the main method.
    //   So, we will not be able to see the swapped values in the main method.

}
    