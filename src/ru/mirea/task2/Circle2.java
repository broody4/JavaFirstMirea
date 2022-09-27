package ru.mirea.task2;

public class Circle2 {
    private int x,y,radius;
    public Circle2(int x,int y,int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double square(){
     return 3.14*radius*radius;
    }
    public double length(){
        return 3.14*2*radius;
    }
    public boolean equal(Circle2 circle){
        if (circle.getRadius()==this.getRadius()) {
            return true;
        }
        return false;
    }

}

