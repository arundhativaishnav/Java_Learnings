import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter operator (+, -, *, /, %) or 'x' to exit: ");
            char op = in.next().charAt(0);
            if (op == 'x' || op == 'X') {
                break;
            }
            System.out.print("Enter first number: ");
            int num1 = in.nextInt();
            System.out.print("Enter second number: ");
            int num2 = in.nextInt();

            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                if (op == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
            } else {
                System.out.println("INVALID INPUT!");
                continue;
            }
            System.out.println("Result: " + ans);
        }
    }
}