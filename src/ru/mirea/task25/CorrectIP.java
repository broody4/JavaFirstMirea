package ru.mirea.task25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectIP {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Pattern p1 = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])");
        Matcher matcher = p1.matcher(s);
        if(matcher.matches()){
            System.out.println("Correct");
        }
        else{System.out.println("Incorrect");}
    }
}
