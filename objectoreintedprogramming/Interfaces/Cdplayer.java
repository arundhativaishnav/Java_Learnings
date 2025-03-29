package objectoreintedprogramming.Interfaces;

public class Cdplayer implements Media {
    @Override
    public void start() {
        System.out.println(" MUSIC START");
    }

    @Override
    public void stop() {
        System.out.println(" MUSIC STOP");
    }
}
