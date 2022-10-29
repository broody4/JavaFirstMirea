package ru.mirea.task13;

import java.text.ParseException;
import java.util.Scanner;

public class PhoneNumber {
    private String number;
    public PhoneNumber(String Number){
        if ((int)(Number.charAt(0))==(int)("+".charAt(0))){
            number = new StringBuilder(Number).insert(Number.length()-10,"-",0,1)
                    .insert(Number.length()-6,"-",0,1)
                    .insert(Number.length()-2,"-",0,1).toString();
        }else{
            number = new StringBuilder(Number).replace(0,1,"+7").toString();
            number = new StringBuilder(number).insert(number.length()-10,"-",0,1)
                    .insert(number.length()-6,"-",0,1)
                    .insert(number.length()-2,"-",0,1).toString();

        }


    }
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите телефонный номер");
        String number = in.nextLine();
        PhoneNumber ph = new PhoneNumber(number);
        System.out.println(ph.number);
    }
}



/*
.append("-",Number.length()-10,Number.length()-9)
        .append("-",Number.length()-7,Number.length()-6)
        .append("-",Number.length()-4,Number.length()-3).toString();
*/
