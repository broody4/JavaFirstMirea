package ru.mirea.task11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends ru.mirea.task9.Student {
    private Date dateOfBirth;
    public Student(int iDNumber, int GPA, Date date) {
        super(iDNumber, GPA);
        dateOfBirth=date;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String toString( String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return "Student{ ID = "+this.iDNumber+", GPA = "+this.GPA+", date of birth = "
                +sdf.format(this.dateOfBirth )+" }";
    }
    public static void main(String []args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        System.out.println("Введите дату рождения в формате \"yyyy MMMM dd HH:mm:ss\"");

        Student student = new Student(1,90,sdf.parse(in.nextLine()));
        System.out.println("Введите новый формат даты:");
        String format = in.nextLine();
        System.out.println(student.toString(format));
    }
}
