package ru.mirea.task10;

import java.util.Comparator;

public class StudentComparatorByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGPA()- o2.getGPA();
    }
}