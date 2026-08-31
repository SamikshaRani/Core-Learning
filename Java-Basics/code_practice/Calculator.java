import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true) {

            System.out.println("For exiting the program, press 'x' or 'X'.");

            System.out.print("Enter the Operator: ");
            char opp = in.next().trim().charAt(0);
            
            if (opp == '+' || opp == '-' || opp == '*' || opp == '/' || opp == '%') {
                System.out.print("Enter the First Number: ");
                int num1 = in.nextInt();
                System.out.print("Enter the Second Number: ");
                int num2 = in.nextInt();

                if (opp == '+') {
                    ans = num1 + num2;
                }
                if (opp == '-') {
                    ans = num1 - num2;
                }
                if (opp == '*') {
                    ans = num1 * num2;
                }
                if (opp == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Number cannot be divided by 0.");
                        continue;
                    }
                }
                if (opp == '%') {
                    ans = num1 % num2;
                }
            }
            else if (opp == 'x' || opp == 'X') {
                System.out.println("Exiting the Program...");
                break;
            }
            else {
                System.out.println("Invalid Operation!");
                continue;
            }
            System.out.println("Result is : " + ans);
        }
        in.close();
    }
}

