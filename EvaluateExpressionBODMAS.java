import java.util.Scanner;
import java.util.Stack;

public class EvaluateExpressionBODMAS {
    public static int precedence(char op) {
        switch (op) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            default: return 0;
        }
    }

    public static int applyOp(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }

    public static int evaluate(String expr) {
        Stack<Integer> nums = new Stack<>();
        Stack<Character> ops = new Stack<>();
        int n = expr.length();
        for (int i = 0; i < n; i++) {
            char c = expr.charAt(i);
            if (c == ' ') continue;
            if (Character.isDigit(c)) {
                int val = 0;
                while (i < n && Character.isDigit(expr.charAt(i))) {
                    val = val * 10 + (expr.charAt(i) - '0');
                    i++;
                }
                nums.push(val);
                i--;
            } else if (c == '(') {
                ops.push(c);
            } else if (c == ')') {
                while (ops.peek() != '(') {
                    int b = nums.pop();
                    int a = nums.pop();
                    nums.push(applyOp(a, b, ops.pop()));
                }
                ops.pop();
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
                    int b = nums.pop();
                    int a = nums.pop();
                    nums.push(applyOp(a, b, ops.pop()));
                }
                ops.push(c);
            }
        }
        while (!ops.isEmpty()) {
            int b = nums.pop();
            int a = nums.pop();
            nums.push(applyOp(a, b, ops.pop()));
        }
        return nums.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expr = scanner.nextLine();
        int result = evaluate(expr);
        System.out.println("Result: " + result);
    }
}