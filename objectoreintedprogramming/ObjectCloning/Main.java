package objectoreintedprogramming.ObjectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        human kunal = new human(34,"hulk kumar");
       // human twine = new human(kunal);

        human twine = (human)kunal.clone();
        System.out.println(twine.age + " " + twine.name);

    }
}
