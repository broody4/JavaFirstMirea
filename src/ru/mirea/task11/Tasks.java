package ru.mirea.task11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию разработчика:");
        String LastName = in.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();

        System.out.println("Введите дату получения задания в формате yyyy MMMM dd HH:mm:ss");
        Date date1 = sdf.parse(in.nextLine());
        System.out.println("Введите дату сдачи задания в формате yyyy MMMM dd HH:mm:ss");
        Date date2 = sdf.parse(in.nextLine());
        System.out.println("Дата получения: "+sdf.format(cal.getTime())+"\nДата сдачи:"+sdf.format(date2));

    }

}
