public class shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 45;//the value of x initialiolized outside is shadowed by this value
        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
