package comparableANDcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> { 
    int rollno;
    String name;

    public Students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students [rollno=" + rollno + ", name=" + name + "]";
    }

    // @Override
    // public int compareTo(Students that) { 
    //     if (this.rollno > that.rollno) {
    //         return 1;
    //     } else if (this.rollno < that.rollno) {
    //         return -1;
    //     } else {
    //         return 0;
    //     }
    // }

    @Override
public int compareTo(Students that) {
    return (this.rollno > that.rollno) ? 1 : (this.rollno < that.rollno) ? -1 : 0;
}

        


}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Students> stud = new ArrayList<>(); 
        stud.add(new Students(20, "Srinivas"));
        stud.add(new Students(10, "Madhav"));
        stud.add(new Students(41, "Praveen"));
        stud.add(new Students(5, "Vamshi"));

        
        Collections.sort(stud);

        
        for (Students s : stud) { 
            System.out.println(s);
        }
    }
}
