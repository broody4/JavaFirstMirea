package ru.mirea.task4.task4_1.shape;

import java.util.Scanner;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){}
    public Shape(String Color, boolean Filled){
        color=Color;
        filled=Filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Shape { color = "+ color+", filled = "+ filled+" }";
    };

public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    System.out.println("Введите заполнена ли окружность");
    Boolean full = Boolean.valueOf(in.nextLine());
    System.out.println("Введите цвет окружности");
    String color=in.nextLine();
    System.out.println("Введите радиус окружности");
    double radius=in.nextDouble();
    in.nextLine();
    Circle okr = new Circle( radius,color ,full );
    System.out.println(okr.toString());
    System.out.println("Введите заполнен ли прямоугольник: ");
    full = Boolean.valueOf(in.nextLine());
    System.out.println("Введите цвет прямоугольника: ");
    color =in.nextLine();
    System.out.println("Введите сначала ширину потом длину прямоугольника");
    double width = in.nextDouble();
    double length = in.nextDouble();
    in.nextLine();
    Rectangle Prg=new Rectangle(width, length,color,full);
    System.out.println(Prg.toString());

    System.out.println("Введите заполнен ли квадрат: ");
    full = Boolean.valueOf(in.nextLine());
    System.out.println("Введите цвет квадрата: ");
    color =in.nextLine();
    System.out.println("Введите сторону квадрата");
    length= in.nextDouble();
    in.nextLine();
    Square Kv =new Square(length,color,full);
    System.out.println(Prg.toString());

}

}
