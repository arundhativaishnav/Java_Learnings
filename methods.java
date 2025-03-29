import java.util.Scanner;
//without arguments
//public class methods {
//    public static void main(String[] args) {
//        int ans= sum() ;
//        System.out.println("THE SUM OF TWO NUMBERS IS :" +ans);
//
//    }
//    static int sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int num1= in.nextInt();
//        System.out.println("Enter second number: ");
//        int num2= in.nextInt();
//        int sum= num1 + num2;
//        return sum;
//    }
//}

//with arguments
public class methods {
    public static void main(String[] args) {
        int ans = sum(20, 49);
        System.out.println("Sum of two numbers is :" + ans);

    }

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}


