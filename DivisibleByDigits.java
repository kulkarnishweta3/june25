import java.util.Scanner;
// This program checks which digits from 1 to 9 divide a given number evenly.
public class DivisibleByDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean found = false;
        System.out.print("Divisible by: ");
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }
}