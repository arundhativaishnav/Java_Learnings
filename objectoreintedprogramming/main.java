package objectoreintedprogramming;

public class main {
    public static void main(String[] args) {
        human.manus Alan = new human.manus(56, "ALAN WALKAR",45000, false);
        human.manus Akash = new human.manus(17, "AKASH JAIN",47000, false);
        System.out.println(Alan.population);
        System.out.println(Akash.population);
        //we know something which is not static belongs to objects
    }
    //static : means we can use it without creating its object
    // static methods , members they belong to class and not to the object
    // this is static and does not depend on object
    static void fun(){
        main obj = new main();
        obj.greeting();
        //we cannot access non static methods withoud referencing them thus here we created its obj to refence it 
    }

     void greeting(){// this depends on object
        fun();
        System.out.println("hello everyone");
    }

}
