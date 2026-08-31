import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = in.nextInt();

        int rev = 0;
        int temp = n;
        int d = 0;

        while (temp > 0) {
            d = temp % 10;
            temp /= 10;

            rev = rev * 10 + d;
        }

        System.out.println("The Reverse of the number " + n + " is " + rev);
        in.close();
    }
}
