package ru.mirea.task4.task4_1.shape;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public  Rectangle(){
        super();
    }
    public Rectangle(double width, double length){
        super();
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length,String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getArea() {
        if (filled)return width*length;
        else return 0;
    }
    @Override
    public double getPerimeter() {
        return 2*length+2*width;
    }


    public String toString() {
        String s = "Rectangle{ Color = "+this.getColor()+", filled = " +this.isFilled()+
                ", width = "+this.width+", length = "+this.getLength()+
                ", Area = "+this.getArea()+", Perimeter = "+this.getPerimeter()+"}";
        return s;
    }


}
