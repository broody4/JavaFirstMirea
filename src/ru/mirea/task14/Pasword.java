package ru.mirea.task14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pasword {
    public static void main(String [] args){
        System.out.println("Введите пароль");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        Pattern p1 = Pattern.compile("[A-Z]");
        Pattern p2 = Pattern.compile("[0-9]");
        Pattern p3 = Pattern.compile("[a-z]");
        Matcher m = p1.matcher(s);
        if (m.find()){
            m=p2.matcher(s);
            if(m.find()){
                m=p3.matcher(s);
                if(m.find()){
                    System.out.println("Пароль надежный");
                } else System.out.println("Пароль ненадежный");
            }else System.out.println("Пароль ненадежный");
        }else System.out.println("Пароль ненадежный");
    }
}
