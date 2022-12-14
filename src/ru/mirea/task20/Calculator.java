package ru.mirea.task20;

import java.util.Scanner;

public class Calculator {
    public <T extends Number,V extends Number> Double sum(T a, V b){
        return (Double.parseDouble(String.valueOf(a))+ Double.parseDouble(String.valueOf(b)));
     }
    public <T extends Number,V extends Number> Double multiply(T a, V b){
        return (Double.parseDouble(String.valueOf(a))* Double.parseDouble(String.valueOf(b)));
    }
    public <T extends Number,V extends Number> Double divide(T a, V b){
        return (Double.parseDouble(String.valueOf(a))/ Double.parseDouble(String.valueOf(b)));
    }
    public <T extends Number,V extends Number> Double subtraction(T a, V b){
        return (Double.parseDouble(String.valueOf(a))- Double.parseDouble(String.valueOf(b)));
    }
    public static void main(String [] args){
        Calculator ob = new Calculator();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        Double a = in.nextDouble();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        System.out.println("Сумма: "+ob.sum(a,b));
        System.out.println("Разность: "+ob.subtraction(a,b));
        System.out.println("Произведение: "+ob.multiply(a,b));
        System.out.println("Частное: "+ob.divide(a,b));
    }
}
