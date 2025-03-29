package objectoreintedprogramming.Generic.comparing;
//Comparable is an example of interface with generic type
public class student implements Comparable<student> {

    int rollno;
    float marks;

    public student(int rollno , float marks){
        this.rollno = rollno;
        this.marks = marks;
    }
    @Override
    public int compareTo(student o) {
        int diff = (int)(this.marks-o.marks);
        return diff;
        //if diff - 0 both are equale
        //if diff <1 , means o is bigger else o is smaller
    }

}
