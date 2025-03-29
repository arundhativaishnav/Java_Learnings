package objectoreintedprogramming.innerclass;

public class A {
    void inA(){
        System.out.println("inside A");
    }

    class B{
        void inB(){
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.inA();
        //as b in inner class of a we need to show that b belongs to a
        A.B obj1 = obj.new B();
        obj1.inB();
    }
}
