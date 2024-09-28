import java.util.Scanner;

public class activity10 {

    public static void main(String[] args) {

        double currentSalary;  // current annual salary
        double rating;    // performance rating
        double raise;    // dollar amount of the raise
        double newSalary; // new salary after raise

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Current Salary: ");
        currentSalary = scan.nextDouble();

        System.out.print("Enter the Performance Rating: ");
        rating = scan.nextDouble();

        if (rating == 1) {
            raise = currentSalary * 0.06;
        } else if (rating == 2) {
            raise = currentSalary * 0.04;
        } else if (rating == 3) {
            raise = currentSalary * 0.015;
        } else {
            System.out.println("Invalid performance rating. Please enter 1, 2, or 3.");
            return;
        }

        newSalary = currentSalary + raise;

        System.out.println("Amount of your raise: $" + String.format("%.2f", raise));
        System.out.println("Your new salary: $" + String.format("%.2f", newSalary));
    }
}