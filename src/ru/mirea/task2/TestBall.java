package ru.mirea.task2;
import java.util.Scanner;
public class TestBall {
    public static void main(String [] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Введите координату Х: ");
        double x=in.nextDouble();
        System.out.println("Введите координату Y: ");
        double y=in.nextDouble();
        Ball ball1=new Ball(x,y);
        System.out.println("Введите на сколько его передвинуть по х: ");
        double Dx=in.nextDouble();
        System.out.println("Введите на сколько его передвинуть по у: ");
        double Dy=in.nextDouble();
        ball1.move(Dx,Dy);
        System.out.println(ball1.toString());
        ball1=new Ball();
        System.out.println("Введите координату Х второго мяча: ");
        x=in.nextDouble();
        System.out.println("Введите координату Y второго мяча: ");
        y=in.nextDouble();
        ball1.setXY(x,y);
        System.out.println("Ball{x = "+ball1.getX()+", y = "+ball1.getY()+"}");
    }
}
