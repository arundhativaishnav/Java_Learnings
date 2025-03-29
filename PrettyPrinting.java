public class PrettyPrinting {
    public static void main(String[] args) {
        float a  = 456.9800f;
        System.out.printf("formatted number is %.2f" , a);

        //placeholder example
        //1. Named Placeholders: * ${name} (Java 14 and later) - uses the String.format() method with named placeholders * :name (Apache Commons Text’s StringSubstitutor) - uses a custom implementation for named placeholders
        //
        //2. Positional Placeholders: * %s (Java’s String.format() method) - replaces with a string value * %d (Java’s String.format() method) - replaces with an integer value * %f (Java’s String.format() method) - replaces with a floating-point value * {0}, {1}, {2}, … (Java’s String.format() method) - replaces with values in the argument list
        //
        //3. Regular Expression-based Placeholders: * (?<name>pattern) (Java’s Pattern class) - captures a group in a regular expression and replaces with a named value
        //
        //4. Custom Placeholders: * :${name} (regex-based placeholders) - uses a custom implementation for regular expression-based placeholders
        //
        //5. MessageFormat Placeholders: * {0}, {1}, {2}, … (Java’s MessageFormat class) - replaces with values in the argument list
        System.out.printf("\n hello my name is %s and i am %s" , "alan" , "cool");

    }
}
