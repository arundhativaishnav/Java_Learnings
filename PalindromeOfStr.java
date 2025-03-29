public class PalindromeOfStr {
    public static void main(String[] args) {
        String original = "abcdabcd"; // Original string
        StringBuilder builder = new StringBuilder(original); // Create StringBuilder from original string
        System.out.println("Original String: " + builder);

        String reversed = builder.reverse().toString(); // Reverse the StringBuilder and convert to String
        System.out.println("Reversed String: " + reversed);

        // Compare original string with reversed string
        if(original.equals(reversed)){
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }
    }
}