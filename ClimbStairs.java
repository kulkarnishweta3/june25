import java.util.Scanner;

public class ClimbStairs {
    public static int climbStairs(int n) {
        if (n <= 1) return 1;
        int prev1 = 1, prev2 = 1;
        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of steps: ");
        int n = scanner.nextInt();
        int result = climbStairs(n);
        System.out.println("Distinct ways to climb: " + result);
    }
}