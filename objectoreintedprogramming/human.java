package objectoreintedprogramming;

public class human {
    public static void main(String[] args) {

    }
    public static class manus{
        int age;
        String name ;
        int salary;
        boolean married ;
        long population;

        public manus(int age , String name , int salary , boolean married) {
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;
            this.population += 1;
        }
    }

}
