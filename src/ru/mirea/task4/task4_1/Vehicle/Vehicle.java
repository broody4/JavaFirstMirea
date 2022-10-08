package ru.mirea.task4.task4_1.Vehicle;

import java.util.Scanner;

public abstract class Vehicle {
    protected double Ax;
    protected double Ay;
    protected double Bx;
    protected double By;
    public Vehicle(){}
    public Vehicle(double Ax,double Ay, double Bx,double By){
        this.Ax=Ax;
        this.Ay=Ay;
        this.Bx=Bx;
        this.By=By;
    }
    public abstract Double cost();
    public abstract Double time();
    public static void main(String [] args){
        System.out.println("Введите координаты точки A");
        Scanner in= new Scanner(System.in);
        double Ax=in.nextDouble();
        double Ay=in.nextDouble();
        System.out.println("Введите координаты точки В");
        double Bx=in.nextDouble();
        double By=in.nextDouble();
        Car car=new Car(Ax,Ay,Bx,By);
        Plane plane= new Plane(Ax,Ay,Bx,By);
        Train train=new Train(Ax,Ay,Bx,By);
        Ship ship = new Ship(Ax,Ay,Bx,By);
        System.out.println("Машина: Время = "+String.format("%.2f",car.time())+" Стоимость = "
                + String.format("%.2f",car.cost()));
        System.out.println("Самолет: Время = "+String.format("%.2f",plane.time())+" Стоимость = "
                + String.format("%.2f",plane.cost()));
        System.out.println("Поезд: Время = "+String.format("%.2f",train.time())+" Стоимость = "
                + String.format("%.2f",train.cost()));
        System.out.println("Корабль: Время = "+String.format("%.2f",ship.time()) +" Стоимость = "
                + String.format("%.2f",ship.cost()));

    }
}
