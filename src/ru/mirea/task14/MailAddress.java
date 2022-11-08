package ru.mirea.task14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MailAddress {

    public static void main(String [] args){
        System.out.println("Введите адресс электронной почты");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        Pattern p1 = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)(\\.([a-zA-Z]{2,5}))?$");
        if(p1.matcher(s).matches()){
            System.out.println("Коректный");
        } else System.out.println("Некоректный");
    }
}
