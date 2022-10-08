package ru.mirea.task4.task4_1.Shape;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super();
        setLength(side);
    }
    public Square(double side,String color,boolean filled){
        super(side, side,color,filled);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        setLength(side);
    }
    public void setLength(double length) {
        setSide(length);
    }

    public void setWidth(double width) {
        setSide(width);
    }

    public String toString() {
        String s = "Rectangle{Color =" + this.getColor() + ", filled = " + this.isFilled() +
                ", side = " + this.getSide()+"}";
    return s;
    }

    
}
