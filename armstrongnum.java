import java.util.Scanner;
public class armstrongnum {
    public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.println("ENTER THE NUMBER:");
//     int n = in.nextInt();
        for (int i = 100; i <1000; i++) {
            if(isArmStrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmStrong(int n){
        int original=n;
        int sum=0;

        while(n>0){
            int rem = n%10;
            n= n/10;
            sum= sum+rem*rem*rem;
        }
        if(sum==original){
            return true;
        }
        return false;
    }
}
