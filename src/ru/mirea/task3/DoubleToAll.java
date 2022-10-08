package ru.mirea.task3;
import java.util.Scanner;
public class DoubleToAll {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Double a1 = Double.valueOf(in.nextDouble());
        in.nextLine();
        Double a2 = Double.valueOf(in.nextLine());
        String s=in.nextLine();
        Double a3 = Double.parseDouble(s);
        System.out.println("перевод первого числа в byte: "+a1.byteValue());
        System.out.println("перевод первого числа в short: "+a1.shortValue());
        System.out.println("перевод первого числа в int: "+a1.intValue());
        System.out.println("перевод первого числа в long: "+a1.longValue());
        System.out.println("перевод первого числа в float: "+a1.floatValue());
        System.out.println("перевод первого числа в boolean невозможен ");
        System.out.println("перевод первого числа в char невозможен ");
        System.out.println("Вывод значения объекта Double: "+a1);
        double f=in.nextDouble();
        s=String.valueOf(f);
        System.out.println(s);
    }


}
