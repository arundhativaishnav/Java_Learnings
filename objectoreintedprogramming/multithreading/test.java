package objectoreintedprogramming.multithreading;

public class test {
    private static Runnable world2;

    public static void main(String[] args) {
//        world world = new world();
//        world.start();
        world2 world = new world2();//new state
        Thread t1 = new Thread(world);
        t1.start();//runnable state
        for (; ; ) {
            System.out.println(Thread.currentThread().getName());
        }


    }
}
