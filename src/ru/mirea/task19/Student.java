package ru.mirea.task19;
import java.util.Objects;
public class Student {
    private final String surName;
    private final String firstName;
    private final String middleName;
    private float score;

    public Student(String surName, String firstName, String middleName) {
        this.surName = surName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Student(String surName, String firstName, String middleName, float score) {
        this.surName = surName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        if (!Objects.equals(surName, student.surName)) return false;
        if (!Objects.equals(firstName, student.firstName)) return false;
        return Objects.equals(middleName, student.middleName);
    }

    public float getScore() {
        return score;
    }

    @Override
    public String toString() {
        return
                surName + " " + firstName + " " + middleName + " " + score;
    }
}
