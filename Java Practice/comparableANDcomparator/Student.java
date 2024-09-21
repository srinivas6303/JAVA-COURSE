package comparableANDcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + "]";
    }


    public static void main(String[] args) {
        List<Student> stud=new ArrayList<>();
        stud.add(new Student(20, "Srinias"));
        stud.add(new Student(10, "Madhav"));
        stud.add(new Student(41, "Praveen"));
        stud.add(new Student(05, "Vamshi"));

        
        
        // Collections.sort(stud, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student i, Student j) {
        //         if (i.rollno > j.rollno) {
        //             return 1; // positive value if i should be after j
        //         } else if (i.rollno < j.rollno) {
        //             return -1; // negative value if i should be before j
        //         } else {
        //             return 0; // 0 if they are equal
        //         }
        //     }
        // });

        //using lamda expression
        Collections.sort(stud,(i,j) -> (i.rollno > j.rollno) ? 1 :(i.rollno < j.rollno)? -1 : 0 );
        
               
    
        for(Student s: stud){
            System.out.println(s);
        }
    }

    

    
    
}
