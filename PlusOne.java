import java.util.Scanner;
import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n = scanner.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter the digits (space separated):");
        for (int i = 0; i < n; i++) {
            digits[i] = scanner.nextInt();
        }
        int[] result = plusOne(digits);
        System.out.println("Resulting digits: " + Arrays.toString(result));
    }
}