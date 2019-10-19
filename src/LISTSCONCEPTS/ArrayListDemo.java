package LISTSCONCEPTS;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    private int rollno;
    private String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        for (int i = 0; i < 10; i++) {
            list.add(new Student(i, "A" + i));
        }
        for (Student student : list) {
            System.out.println(student.getRollno());
            System.out.println(student.getName());
        }

        //***************       THE ABOVE FOR EACH LOOP AND USE OF ITERATOR IS SAME
        Iterator<Student> it= list.iterator();
        while (it.hasNext()){
            Student student = it.next();
            System.out.println(student.getRollno());
            System.out.println(student.getName());
        }
    }
}
