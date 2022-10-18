package ru.mirea.task6.convert_temperature;

import java.util.Scanner;

public class temperature implements Convertable {
    private int C ;

    public void setC(int c) {
        C = c;
    }

    public int getC() {
        return C;
    }

    @Override
    public int ConvertToK() {
        return C+273;
    }

    @Override
    public int ConvertToF() {
        return C*9/5+32;
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите температуру в цельсиях");
        int C = in.nextInt();
        temperature temp = new temperature();
        temp.setC(C);
        System.out.println("Температура в кельвинах: "+ temp.ConvertToK() );
        System.out.println("Температура в фаренгейтах: "+ temp.ConvertToF() );
    }
}
