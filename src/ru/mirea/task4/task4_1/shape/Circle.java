package ru.mirea.task4.task4_1.shape;

public class Circle extends Shape {
    private double radius;
    public Circle(){
    super();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle (double radius){
        super();
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getArea(){
        if (filled)return 3.14*radius*radius;
        else return 0;
    }
    public  double getPerimeter(){
        return 2*3.14*radius;
    }
    public String toString(){
        String s;
        s="Circle{ Color = "+this.getColor()+", filled = "+this.isFilled()+
                ", radius = "+this.getRadius()+", Area = "+getArea()+", Perimeter = "+this.getPerimeter()+" };";
        return s;
    }

}
