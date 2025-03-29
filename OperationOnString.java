import java.util.ArrayList;

public class OperationOnString {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a"+ "b");
        System.out.println('a' + "b");
        System.out.println((char) ('a' + 8));
        System.out.println("a" + 1);
        // when an integer is concated with string it is converted i=to ints wrapper class that will call toString()

        System.out.println( new Integer(56) + " "  + new ArrayList<>());
        //java does not support operator overloading
        /* + operator in java can only be used for primitives or if one  of them is string and complex as well but one of object  should be of typestring */
    }
}
