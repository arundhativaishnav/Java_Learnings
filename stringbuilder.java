public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);

            //use to make string mutable


        }
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder);
    }
}
