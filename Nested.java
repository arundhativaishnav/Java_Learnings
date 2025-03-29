import java.util.Scanner;
public class Nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch(empId){
            case 1 :
                System.out.println("kunal");
                break;

            case 2 :
                System.out.println("Ram");
                break;

            case 3 :
                System.out.println("case number 3 ");
                switch(department){
                    case "IT":
                        System.out.println("It deparment");
                        break;

                    case "Management":
                        System.out.println("Management deparment");
                        break;

                    default:
                        System.out.println("Enter valid department ");
                        break;
                }
            default:
                System.out.println("Enter valid empId ");
                break;
        }


    }
}
