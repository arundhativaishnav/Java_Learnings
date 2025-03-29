import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = in.nextInt();
        System.out.println("Enter value of b:");

        int b = in.nextInt();
        System.out.println("Enter value of c:");
        int c = in.nextInt();
        int max=0;

        if (a>b){
            max=a;
        }
        if (b>c){
            max=b;
        }else {
            max=c;
        }
        System.out.println("largest number is :" +max);


    }
}
