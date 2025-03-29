package objectoreintedprogramming.Interfaces;

public class Powerengine implements engine {
    @Override
    public void start() {
        System.out.println(" powerengine start");
    }

    @Override
    public void stop() {
        System.out.println(" powerengine stop");
    }

    @Override
    public void acc() {
        System.out.println(" powerengine accelerate");
    }
}
