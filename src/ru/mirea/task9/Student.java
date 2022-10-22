package ru.mirea.task9;

public class Student implements Comparable<Student> {
    public int iDNumber;
    public int GPA;

    @Override
    public int compareTo(Student o) {
        return iDNumber-o.iDNumber;
    }

    public Student(int iDNumber, int GPA){
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }


}
