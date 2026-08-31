import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number on or before which you want the series to end: ");
        int n = in.nextInt();

        int f = 0;
        int b = 1;
        System.out.print(f + "," + b + ",");
        int t = f + b;
        while (t < n) {
            System.out.print(t);
            f = b;
            b = t;
            t = f + b;
            if (t < n) {
                System.out.print(",");
            }
        }
        in.close();
    }
}
