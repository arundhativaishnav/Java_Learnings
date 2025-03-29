package objectoreintedprogramming.Interfaces;

public class CustomCar {
    private engine  engine;

    public CustomCar(){
        engine = new Powerengine() ;
    }
    public CustomCar(engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
}
