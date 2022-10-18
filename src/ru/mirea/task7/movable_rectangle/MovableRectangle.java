package ru.mirea.task7.movable_rectangle;

import ru.mirea.task6.movablecircle.Movable;
import ru.mirea.task6.movablecircle.MovablePoint;

import java.util.Scanner;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft = new MovablePoint();
    private MovablePoint bottomRight = new MovablePoint();

    public MovableRectangle(int topLeftX,int topLeftY,int bottomRightX,int bottomRightY, int xSpeed ,int ySpeed ){
        this.topLeft = new MovablePoint(topLeftX,topLeftY,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint(bottomRightX,bottomRightY,xSpeed,ySpeed);

    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{ "+topLeft.toString()+", "+bottomRight.toString()+"}";
    }

    public boolean SpeedTest(){
        return ((this.topLeft.getxSpeed()==this.bottomRight.getxSpeed())
                &(this.topLeft.getySpeed() ==this.bottomRight.getySpeed() ));
    }

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты левой верхней вершины прямоугольника:");
        int topLeftX=in.nextInt();
        int topLeftY=in.nextInt();
        System.out.println("Введите координаты правой нижней вершины прямоугольника");
        int bottomRightX=in.nextInt();
        int bottomRightY=in.nextInt();
        System.out.println("Введите Скорость по оси X");
        int xSpeed=in.nextInt();
        System.out.println("Введите Скорость по оси Y");
        int ySpeed = in.nextInt();
        MovableRectangle rect = new MovableRectangle(topLeftX,topLeftY,bottomRightX,bottomRightY,xSpeed,ySpeed);
        rect.moveLeft();
        rect.moveDown();
        if(rect.SpeedTest()){System.out.println("Точки движутся с одной скоростью");}
        else{System.out.println("Точки движутся с разной сксоростью");}

        System.out.println(rect.toString());
    }
}
