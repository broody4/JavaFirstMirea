package ru.mirea.task4.task4_1.vehicle;

public class Plane extends Vehicle {
    public Plane(double Ax,double Ay,double Bx,double By){
        super(Ax,Ay,Bx,By);
    }
    @Override
    public Double cost() {
        return Math.sqrt((Ax - Bx) * (Ax - Bx) + (Ay - By) * (Ay - By)) * 50;
    }
    @Override
    public Double time(){
        return Math.sqrt((Ax - Bx) * (Ax - Bx) + (Ay - By) * (Ay - By))/500;
    }
}
