import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fruit name :");
        String fruits= in.next();

        switch(fruits){
            case "Mango":
                System.out.println("king of fruits");
                break;
            case "Apple":
                System.out.println("sweet red fruit");
                break;

            default:
                System.out.println("Enter valid fruit name ");


        }

    }
}
