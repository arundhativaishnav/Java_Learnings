public class StringPerformance {
    public static void main(String[] args) {
        String series ="" ;
        for (int i = 0; i < 26 ; i++) {
            char ch = (char)('a' + i);
            System.out.println(ch);
        }
        System.out.println(series);
        /* here after every itteration new object will be created without any reference which leads to wastege of space thus there should a method which will make changes in the exsisting object without creating the new one */
        //thus we use StringBuilder()
    }
}
