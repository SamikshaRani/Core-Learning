import java.util.Scanner;

public class MaximumMinimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int n1 = in.nextInt();
        System.out.print("Enter Second Number: ");
        int n2 = in.nextInt();
        System.out.print("Enter Third Number: ");
        int n3 = in.nextInt();

        // int max = n1;
        // int min = n1;

        // if (n2 > max) {
        //     max = n2;
        // }
        // else if (n3 > max) {
        //     max = n3;
        // }

        // if (n2 < min) {
        //     min = n2;
        // }
        // else if (n3 < min) {
        //     min = n3;
        // }

        int max = Math.max(n3, Math.max(n1, n2));
        int min = Math.min(n3, Math.min(n1, n2));

        System.out.println("Maximum Number is: " + max);
        System.out.println("Minimum Number is: " + min);

        in.close();
    }
}
