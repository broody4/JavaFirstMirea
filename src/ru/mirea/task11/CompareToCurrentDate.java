package ru.mirea.task11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Math.abs;

public class CompareToCurrentDate {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Date current = new Date();
        System.out.println("Введите дату в формате \"yyyy MMMM dd HH:mm:ss\"");
        Date date = sdf.parse(in.nextLine());
        if(current.compareTo(date)>0) System.out.println("Текущая дата позже введенной");
        else if (current.compareTo(date)<0) {System.out.println("Текущая дата раньше введенной");}
        else {System.out.println("Текущая дата равна введенной");}
}
}
