import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        System.out.println("Spiral order:");
        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++)
                System.out.print(matrix[top][i] + " ");
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++)
                System.out.print(matrix[i][right] + " ");
            right--;

            // Print bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }

            // Print left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }
}