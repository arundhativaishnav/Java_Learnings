package objectoreintedprogramming.Generic.comparing;

public class main {
    public static void main(String[] args) {
        student kunal= new student(12,89.00f);
        student rahul= new student(24,90.89f);

        if(kunal.compareTo(rahul) <0)//here java got confused
             {
        {
            System.out.println(kunal.compareTo(rahul) );
            System.out.println("rahul has more marks then kunal");
        }
        }

    }
}
