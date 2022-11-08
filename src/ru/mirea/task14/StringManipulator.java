package ru.mirea.task14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringManipulator {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Pattern p1 = Pattern.compile(" ");
        String [] arr= p1.split(s);
        for (String i:arr){
            System.out.println(i);
        }
    }

}
