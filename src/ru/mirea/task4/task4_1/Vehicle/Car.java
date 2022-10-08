package ru.mirea.task4.task4_1.Vehicle;
import java.lang.Math;
public class Car extends Vehicle {
    public Car(double Ax,double Ay,double Bx,double By){
        super(Ax,Ay,Bx,By);
    }
    @Override
    public Double cost() {
        return Math.sqrt((Ax - Bx) * (Ax - Bx) + (Ay - By) * (Ay - By)) * 15;
    }
    @Override
    public Double time(){
        return Math.sqrt((Ax - Bx) * (Ax - Bx) + (Ay - By) * (Ay - By))/72;
    }
}
