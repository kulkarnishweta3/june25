import java.util.Scanner;
// This program checks which digits from 1 to 9 divide a given number evenly.
public class DivisibleByDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Close the scanner to prevent resource leaks
        boolean found = false;
        System.out.print("Divisible by: ");
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                found = true;
            }
        }
        // If no digits divide the number, print "None"
        if (!found) {
            System.out.print("None");
        }
        // Print a new line for better readability
        System.out.println();
    }
}