package ru.mirea.task14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class IsCorrect {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = p1.matcher(s);
        if(matcher.matches()){
            System.out.println("Correct");
        }
        else{System.out.println("Incorrect");}
    }
}
