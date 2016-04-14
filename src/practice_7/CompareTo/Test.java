package practice_7.CompareTo;

import java.util.Arrays;

/**
 * Created by OmeN on 13.04.2016.
 */

class Student implements Comparable {

    public int id;
    public String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Student tmp = (Student) o;
        if(this.id < tmp.id) // текущий меньше полученного
            return -1;
        else if (this.id > tmp.id) // текущий больше полученного
            return 1;

        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Test {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(322, "student_1");
        students[1] = new Student(666, "student_2");
        students[2] = new Student(228, "student_3");

        // сортировка массива при помощи метода compareTo
        Arrays.sort(students);

        for(Student s : students) {
            System.out.println(s);
        }
    }
}
