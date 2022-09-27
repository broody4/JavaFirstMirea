package ru.mirea.task2;

public class Circle {
    private Point centre;
    private Double Radius;
    public Circle(double x,double y,double radius){
        centre=new Point(x,y);
        Radius=radius;
    }
    public Circle(){
        centre=new Point();
        Radius=0.0;
    }

    public Double getRadius() {
        return Radius;
    }

    public double getX() {
        return centre.getX();
    }

    public double getY() {
        return centre.getY();
    }

    public Double getSquare(){
        return 3.14*Radius*Radius;
    }
}
