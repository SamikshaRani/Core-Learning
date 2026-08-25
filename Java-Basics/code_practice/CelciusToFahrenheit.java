import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Temperature in Celcius: ");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println("The Temperature in Fahrenheit is: " + tempF);
        
        input.close();
    }
    
}
