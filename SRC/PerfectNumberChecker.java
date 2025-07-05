import java.util.InputMismatchException;
import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // Step 1: Prompt and validate input
        while (true) {
            try {
                System.out.print("Enter a positive integer: ");
                number = scanner.nextInt();

                if (number <= 0) {
                    throw new IllegalArgumentException("Number must be positive.");
                }
                break; // Input is valid, exit loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Clear invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Step 2: Calculate sum of proper divisors
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Step 3: Determine if it's a perfect number
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is NOT a perfect number.");
        }

        scanner.close();
    }
}
