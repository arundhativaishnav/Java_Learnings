package objectoreintedprogramming.Interfaces;

public class PetrolEngine implements engine {

    @Override
    public void start() {
        System.out.println(" petrolengine start");
    }

    @Override
    public void stop() {
        System.out.println(" petrolengine stop");
    }

    @Override
    public void acc() {
        System.out.println(" petrolengine accelerate");
    }
}
