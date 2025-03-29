package objectoreintedprogramming.propertie1Inheritence;

public class Box {
    double l;
    double h;
    double w;
//created a constructer without any arguments
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    //created a constructor with one argument
    //cube
    Box (double side ){
        this.w= side;
        this.l= side;
        this.h= side;
    }
//created a constructer with three arguments
    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    //created a copy constructor
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public void display(){
        System.out.println("Running the Box");
    }
}
