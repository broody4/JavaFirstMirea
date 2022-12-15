package ru.mirea.task25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectExpression {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Pattern p1 = Pattern.compile("[\\d+/*-]*\\([\\d+/*-]*\\)[\\d+/*-]*");
        Matcher matcher = p1.matcher(s);
        while (matcher.find()){
            s = matcher.replaceAll("");
            matcher = p1.matcher(s);
        }

        if (s.length()==0){ System.out.println("Correct");}
        else{System.out.println("Incorrect");}
    }
}
