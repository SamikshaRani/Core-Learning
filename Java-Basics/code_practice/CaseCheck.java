import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Character to be checked: ");
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The entered character is Lowercase.");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The entered character is Uppercase.");   
        }
        else {
            System.out.println("Invalid Input!");
        }
        in.close();
    }
}
