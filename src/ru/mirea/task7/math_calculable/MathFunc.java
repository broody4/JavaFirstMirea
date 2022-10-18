package ru.mirea.task7.math_calculable;

import java.util.Scanner;

public class MathFunc implements MathCalculable{

    @Override
    public double exp(double x, double n) {
        return  Math.pow(x,n);
    }

    @Override
    public double module(double x,double y) {
        return Math.sqrt(x*x+y*y);
    }

    public double CurcleArea(double r){
        return p*r*r;
    }

    public double CircleLength(double r){
        return 2*p*r;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        MathFunc math = new MathFunc();
        System.out.println("Введите сначала число, а потом степень в которую его надо возвести");
        double x= in.nextDouble();
        double n = in.nextDouble();
        System.out.println(x+" в сепени "+n+" = "+math.exp(x,n));
        System.out.println("Введите сначала целую, а потом мнимую часть комплексного числа");
        x=in.nextDouble();
        double y = in.nextDouble();
        System.out.println("Модуль данного комплексного числа равен: "+math.module(x,y));
        System.out.println("Введите радиус окружности: ");
        double r  = in.nextDouble();
        System.out.println("Длина окружности: "+math.CircleLength(r));
        System.out.println("Площадь круга: "+math.CurcleArea(r));
    }


}
