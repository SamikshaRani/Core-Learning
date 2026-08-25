import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.print("Enter a Number: ");
        int n = in.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
        }
        else {
            int c = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
        
        in.close();
    }
}

