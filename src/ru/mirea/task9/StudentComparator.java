package ru.mirea.task9;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.GPA-o2.GPA;
    }
}
