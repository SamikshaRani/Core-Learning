import java.util.Scanner;

public class FrequencyNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        System.out.print("Enter the digit whose frequency is to be checked: ");
        int d = in.nextInt();

        int f = 0;
        int temp = num;
        int n = 0;

        while (temp > 0) {
            n = temp % 10;
            if (n == d) {
                f++;
            }
            temp = temp / 10;
        }

        System.out.println("The frequency of the digit " + d + " in the provided number " + num + " is " + f);
        
        in.close();
    }
}
