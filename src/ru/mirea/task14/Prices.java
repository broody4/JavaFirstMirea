package ru.mirea.task14;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prices {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Pattern p1 = Pattern.compile("(^|\\s)\\d+(\\.\\d{0,2})?\\s(USD|EU|RUB)");
        Matcher matcher = p1.matcher(s);
        ArrayList<String> prices = new ArrayList<>();
        while(matcher.find()) {
                prices.add(matcher.group());
                s=s.replace(matcher.group(),"");
                s=s.strip();
        }
        for(String i:prices){
            System.out.println(i.strip());
        }
    }
}
