import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Alan Walker";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('W'));
    }
}
