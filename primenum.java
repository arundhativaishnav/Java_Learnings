import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            int c = 2;
            while (c * c <= n) {
                if (n % c == 0) {
                    return false;
                }
                c++;
            }
            return true; // corrected this line
        }
    }
}