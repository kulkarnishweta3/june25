import java.util.Scanner;

public class MySqrt {
    public static int mySqrt(int x) {
        if (x < 2) return x;
        int left = 1, right = x / 2, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long)mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int x = scanner.nextInt();
        int result = mySqrt(x);
        System.out.println("Integer square root: " + result);
    }
}