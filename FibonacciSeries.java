import java.util.Scanner;

// This program generates the Fibonacci series up to a specified number of terms.
public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Initialize the first two terms of the Fibonacci series
        int a = 0, b = 1;

        // Print the Fibonacci series
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b; // Calculate the next term
            a = b; // Update a to the next term
            b = nextTerm; // Update b to the next term
        }

        // Print a new line for better readability
        System.out.println();
    }
}