package objectoreintedprogramming.ExceptionHandling;
// to create custom exception we have to first create a class of that exception which will extend the parent class(i.e, Exception) nd then create constructor

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        //int c = a/b;



        try{
           a = a/b;
           if(b==0)
               throw new ArithmeticException("dont want to print");

        }
        catch(ArithmeticException e ){
            System.out.println("thats default output!" + e);
        }
        catch(Exception e){
            System.out.println("something went wrong !" );
        }
        System.out.println(a/b);
    }
}
