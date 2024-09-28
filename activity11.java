import java.util.Scanner;

public class activity11 {

    public static void main(String[] args) {

        int temperature;  // temperature in degrees Fahrenheit

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the temperature in degrees Fahrenheit: ");
        temperature = scan.nextInt();

        if (temperature >= 80 && temperature <= 94) {
            System.out.println("Swimming is a great activity for today!");
        } else if (temperature >= 60 && temperature <= 79) {
            System.out.println("Why not try tennis?");
        } else if (temperature >= 40 && temperature <= 59) {
            System.out.println("Golf is a great option for today!");
        } else if (temperature >= 21 && temperature <= 39) {
            System.out.println("Skiing is a great activity for today!");
        } else {
            System.out.println("Visit our shops!");
        }
    }
}