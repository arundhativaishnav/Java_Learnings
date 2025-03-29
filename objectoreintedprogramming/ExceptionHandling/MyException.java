package objectoreintedprogramming.ExceptionHandling;

import com.sun.jdi.PathSearchingVirtualMachine;

public class MyException extends Exception{
    public MyException(String message){
        super(message);
    }

    public static void main(String[] args) {
       try{
           throw new MyException("I dont want to print ");
       } catch (MyException e) {
           System.out.println("default exception " + e);
       }
    }
}


